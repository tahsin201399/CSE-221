import java.util.Scanner;
public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            int k = sc.nextInt(); 
            for(int j = 0; j < k; j++){
                int neighbor = sc.nextInt();
                arr[i][neighbor] = 1; 
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
