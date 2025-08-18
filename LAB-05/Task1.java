import java.util.*;
public class Task1{
    static int N,M;
    static int[] head,next,to;
    static int idx=0;
    static void addEdge(int u,int v){
        to[idx]=v; 
        next[idx]=head[u]; 
        head[u]=idx++;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt(); M=sc.nextInt();
        head=new int[N+1];
        Arrays.fill(head,-1);
        next=new int[2*M];
        to=new int[2*M];
        for(int i=0;i<M;i++){
            int u=sc.nextInt(), v=sc.nextInt();
            addEdge(u,v);
            addEdge(v,u);
        }
        boolean[] vis=new boolean[N+1];
        int[] q=new int[N+5];
        int front=0,back=0;
        q[back++]=1; 
        vis[1]=true;
        while(front<back){
            int u=q[front++];
            System.out.print(u+" ");
            for(int e=head[u];e!=-1;e=next[e]){
                int v=to[e];
                if(!vis[v]){
                    vis[v]=true;
                    q[back++]=v;
                }
            }
        }
        sc.close();
    }

}
