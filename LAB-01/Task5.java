import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        boolean changed = true;
        while(changed){
            changed = false;
            for(int i = 0; i <= n - 3; i++){
                if ( a[i] > a[i + 2]){
                    int temp = a[i];
                    a[i] = a[i + 2];
                    a[i + 2] = temp;
                    changed = true;
                }
            }
        }
        boolean sorted = true;
        for(int i = 0; i < n - 1; i++){
            if(a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        if(sorted) System.out.println("YES");
        else  System.out.println("NO");
        sc.close();
    }
}
