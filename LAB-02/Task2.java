import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int K = Integer.parseInt(firstLine[2]);
        int[] A = new int[N];
        String[] aLine = reader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(aLine[i]);
        }
        int[] B = new int[M];
        String[] bLine = reader.readLine().split(" ");
        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(bLine[i]);
        }
        int i = 0;
        int j = M - 1;
        int BI = 0;
        int BJ = 0;
        int initialSum = A[0] + B[M - 1];
        int minDiff;
        if(initialSum >= K){
            minDiff = initialSum - K;
        } 
        else{
            minDiff = K - initialSum;
        }
        while(i < N && j >= 0){
            int sum = A[i] + B[j];
            int diff;
            if(sum >= K){
                diff = sum - K;
            } 
            else{
                diff = K - sum;
            }
            if(diff <= minDiff){
                minDiff = diff;
                BI = i;
                BJ = j;
            }

            if(sum > K){
                j--;
            } 
            else{
                i++;
            }
        }
        System.out.println((BI + 1) + " " + (BJ + 1));
    }
}
