import java.io.*;
import java.util.*;

public class Task4{
    static ArrayList<Integer>[] adj;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        int D=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        adj=new ArrayList[N+1];
        for(int i=0;i<=N;++i) adj[i]=new ArrayList<>();

        for(int i=0;i<M;++i){
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            adj[u].add(v);
        }

        List<Integer> path1=bfsPath(S,K,N);
        if(path1==null){
            pw.println(-1);
            pw.flush();
            return;
        }

        List<Integer> path2=bfsPath(K,D,N);
        if(path2==null){
            pw.println(-1);
            pw.flush();
            return;
        }

        List<Integer> fullPath=new ArrayList<>(path1);
        for(int i=1;i<path2.size();++i) fullPath.add(path2.get(i));

        pw.println(fullPath.size()-1);
        for(int i=0;i<fullPath.size();++i){
            pw.print(fullPath.get(i));
            if(i!=fullPath.size()-1) pw.print(" ");
        }
        pw.println();
        pw.flush();
    }

    private static List<Integer> bfsPath(int start,int end,int N){
        Queue<Integer> q=new LinkedList<>();
        parent=new int[N+1];
        visited=new boolean[N+1];
        Arrays.fill(parent,-1);

        q.add(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int u=q.poll();
            if(u==end) break;
            for(int v:adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    parent[v]=u;
                    q.add(v);
                }
            }
        }

        if(!visited[end]) return null;

        ArrayList<Integer> path=new ArrayList<>();
        for(int cur=end;cur!=-1;cur=parent[cur]) path.add(cur);
        Collections.reverse(path);
        return path;
    }
}