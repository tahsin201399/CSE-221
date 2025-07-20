import java.util.*;
public class Task5 {
    public static void preOrder(int[] arr, int l, int r){
        if (l > r) return;
        int mid = (l + r) / 2;
        System.out.print(arr[mid] + " ");
        preOrder(arr, l, mid - 1);
        preOrder(arr, mid + 1, r);
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        preOrder(arr, 0, n - 1);
        sc.close();
    }
}