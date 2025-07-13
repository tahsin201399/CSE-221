import java.util.*;
public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }
        while(q--> 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int l = lower(arr, a);
            int r = upper(arr, b);
            System.out.println((r - l ));
    }
        scanner.close();
 }
    public static int lower(int[] arr, int a){
        int l = 0 ; int high = arr.length;
        while(l < high){
            int mid = (l + high) / 2;
            if(arr[mid] < a) l = mid + 1;
            else high = mid;
        }
        return l;
    }
    public static int upper(int[] arr, int b){
        int l = 0; int high = arr.length;
        while(l < high){
            int mid = (l + high) / 2;
            if(arr[mid] <= b)  l = mid + 1;
            else high = mid;
        }
        return l;
    }
}
