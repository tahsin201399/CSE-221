import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        int[] indegree = new int[n + 1];    
        int[] outdegree = new int[n + 1];
        for(int i = 0; i < m; i++){
            int from = arr1[i];
            int to = arr2[i];
            outdegree[from]++;
            indegree[to]++;
        }
        for(int i = 1; i <= n; i++){
            int diff = indegree[i] - outdegree[i];
            System.out.print(diff + " ");
        }
        sc.close();
    }
}
