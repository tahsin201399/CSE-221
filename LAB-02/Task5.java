import java.util.Scanner;
public class Task5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int left= 0;
        int sum =0;
        int maxLength =0;
        for(int right= 0;right <n;right++){
            sum += arr[right];
            while(sum > k){
                sum -= arr[left];
                left++;
            }
            int length = right -left+1;
            if(length > maxLength){
                maxLength = length;
            }
        }
        System.out.println(maxLength);
        scanner.close();
    }
}
