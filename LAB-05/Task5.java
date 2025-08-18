import java.io.*;
import java.util.*;

public class Task5{
    static ArrayList<Integer>[] adj;
    static int[] subtreeSize;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int R=Integer.parseInt(st.nextToken());

        adj=new ArrayList[N+1];
        for(int i=0;i<=N;++i) adj[i]=new ArrayList<>();

        for(int i=0;i<N-1;++i){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        subtreeSize=new int[N+1];
        dfs(R,0);

        int Q=Integer.parseInt(br.readLine());
        for(int i=0;i<Q;++i){
            int X=Integer.parseInt(br.readLine());
            pw.println(subtreeSize[X]);
        }
        pw.flush();
    }

    private static void dfs(int u,int parent){
        subtreeSize[u]=1;
        for(int v:adj[u]){
            if(v!=parent){
                dfs(v,u);
                subtreeSize[u]+=subtreeSize[v];
            }
        }
    }
}