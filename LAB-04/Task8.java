import java.util.Scanner;
import java.util.Arrays;
public class Task8 {
    public static int gcd(int a, int b){
        while(b!=0) {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int[][] neighbors=new int[N+1][N];
        int[] count=new int[N+1];
        for(int i=1;i<=N;i++) {
            int idx=0;
            for(int j=1;j<=N;j++) {
                if(i!=j && gcd(i,j)==1){
                    neighbors[i][idx]=j;
                    idx++;
                }
            }
            count[i]=idx;
            Arrays.sort(neighbors[i],0,idx);
        }
        for(int q=0;q<Q;q++){
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(k>count[x]) {
                System.out.println(-1);
            } 
            else{
                System.out.println(neighbors[x][k-1]);
            }
        }
        sc.close();
    }
}
