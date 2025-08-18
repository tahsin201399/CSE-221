import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[m];
        int [] brr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            brr[i] = sc.nextInt();
        }
        int [] degree = new int[n+1];
        for(int i = 0; i < m; i++){
            degree[arr[i]]++;
            degree[brr[i]]++;
        }
        int oddCount = 0;
        for(int i = 1; i <= n; i++){
            if (degree[i] % 2 != 0){
                oddCount++;
            }
        }
        if(oddCount == 0 || oddCount == 2){
            System.out.println("YES");
        } 
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
