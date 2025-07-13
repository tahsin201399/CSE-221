import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int a = Integer.parseInt(firstLine[1]);
        int[] arr = new int[N];
        String[] numbers = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int l = 0;
        int r = N - 1;
        while(l < r){
            int sum = arr[l] + arr[r];
            if (sum == a){
                System.out.println((l+1) + " " + (r+1));
                return;
            } 
            else if (sum < a) l++;
             else    r--;
            
        }
        System.out.println("-1");
    }
}
