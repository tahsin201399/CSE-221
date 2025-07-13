import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0){
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            long low = 1;
            long high =Long.MAX_VALUE; 
            long ans = 0;
            while (low <= high) {
                long mid = (low + high)/2;
                long count = mid - mid /x;
                if(count >= k){
                    ans = mid;
                    high = mid - 1;
                } 
                else low = mid + 1;
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}
