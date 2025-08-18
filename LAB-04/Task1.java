import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] graph = new int[n][n]; 
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt(); 
            int w = sc.nextInt(); 
            graph[u - 1][v - 1] = w; 
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(graph[i][j]);
                if(j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
