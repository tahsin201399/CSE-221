import java.io.*;
import java.util.*;

public class Task7{
    static int R,H;
    static char[][] grid;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);

        StringTokenizer st=new StringTokenizer(br.readLine());
        R=Integer.parseInt(st.nextToken());
        H=Integer.parseInt(st.nextToken());

        grid=new char[R][H];
        visited=new boolean[R][H];

        for(int i=0;i<R;++i){
            String line=br.readLine();
            for(int j=0;j<H;++j) grid[i][j]=line.charAt(j);
        }

        int maxDiamonds=0;
        for(int i=0;i<R;++i){
            for(int j=0;j<H;++j){
                if(!visited[i][j] && grid[i][j]!='#'){
                    int count=dfs(i,j);
                    if(count>maxDiamonds) maxDiamonds=count;
                }
            }
        }

        pw.println(maxDiamonds);
        pw.flush();
    }

    private static int dfs(int i,int j){
        if(i<0 || i>=R || j<0 || j>=H) return 0;
        if(visited[i][j] || grid[i][j]=='#') return 0;

        visited[i][j]=true;
        int count=(grid[i][j]=='D')?1:0;

        count+=dfs(i+1,j);
        count+=dfs(i-1,j);
        count+=dfs(i,j+1);
        count+=dfs(i,j-1);

        return count;
    }
}