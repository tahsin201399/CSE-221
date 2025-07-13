import java.util.Scanner;
public class Task6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int[]p =new int[n + 1]; 
        int left= 0, dist = 0, maxy = 0;
        for(int right = 0; right < n; right++){
            if(p[arr[right]] == 0) {
                dist++;
            }
            p[arr[right]]++;
            while(dist > k){
                p[arr[left]]--;
                if(p[arr[left]] == 0){
                    dist--;
                }
                left++;
            }
            int len =right-left+1;
            if(len > maxy){
                maxy = len;
            }
        }
        System.out.println(maxy);
        scanner.close();
    }
}
