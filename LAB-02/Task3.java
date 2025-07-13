import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task3{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int Target = Integer.parseInt(firstLine[1]);
        int[] arr = new int[N];
        int [] arr1 = new int[N];
        String[] inputnumbers = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(inputnumbers[i]);
            arr1[i]=i+1;
    }
    //sort
        for (int i = 0; i < N - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
         }
         int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
            int temp1 = arr1[i];
            arr1[i] = arr1[minidx];
            arr1[minidx] = temp1;
      }
      for(int i = 0 ; i <N-2;i++){
        int tar= Target - arr[i];
        int l = i + 1;
        int r = N - 1;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum == tar){
                System.out.println(arr1[i] + " " + arr1[l] + " " + arr1[r]);
                return;
            } 
            else if(sum < tar)  l++;
            else r--;
        }
      }
        System.out.println("-1");
    }
}
