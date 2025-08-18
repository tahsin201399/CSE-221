import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] u = new int[M];
        int[] v = new int[M];
        int[] w = new int[M];
        for(int i=0;i<M;i++) u[i] = sc.nextInt();
        for(int i=0;i<M;i++) v[i] = sc.nextInt();
        for(int i=0;i<M;i++) w[i] = sc.nextInt();
        int[][] to = new int[N][M];
        int[][] weight = new int[N][M];
        int[] count = new int[N];
        for(int i=0;i<M;i++){
            int from = u[i] - 1;
            int dest = v[i];
            int wt = w[i];
            to[from][count[from]] = dest;
            weight[from][count[from]] = wt;
            count[from]++;
        }
        for(int i=0;i<N;i++){
            System.out.print((i + 1) + ":");
            for(int j=0;j<count[i];j++){
                System.out.print(" (" + to[i][j] + "," + weight[i][j] + ")");
            }
            System.out.println();
        }
        sc.close();
    }
}
