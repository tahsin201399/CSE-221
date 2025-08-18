import java.io.*;
import java.util.*;

public class Task6{
    static ArrayList<Integer>[] adj;
    static int[] color;
    static boolean hasCycle=false;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        adj=new ArrayList[N+1];
        for(int i=0;i<=N;++i) adj[i]=new ArrayList<>();

        for(int i=0;i<M;++i){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj[u].add(v);
        }

        color=new int[N+1];
        for(int i=1;i<=N;++i){
            if(color[i]==0){
                dfs(i);
            }
        }

        pw.println(hasCycle?"YES":"NO");
        pw.flush();
    }

    private static void dfs(int u){
        color[u]=1;
        for(int v:adj[u]){
            if(color[v]==0){
                dfs(v);
                if(hasCycle) return;
            } else if(color[v]==1){
                hasCycle=true;
                return;
            }
        }
        color[u]=2;
    }
}