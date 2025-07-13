import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        String[] aliceInput = reader.readLine().split(" ");
        int [] alice = new int[x];
        for (int i = 0; i < x; i++){
            alice[i] = Integer.parseInt(aliceInput[i]);
        }
        int y = Integer.parseInt(reader.readLine());
        String[] bobInput = reader.readLine().split(" ");
        int [] bob = new int[y];
        for(int i = 0; i < y; i++){
            bob[i] = Integer.parseInt(bobInput[i]);
        }
        int a = 0, b = 0;
        StringBuilder result = new StringBuilder();
        while(a < x && b < y){
            if(alice[a] < bob[b]){
                result.append(alice[a]).append(" ");
                a++;
            }
            else {result.append(bob[b]).append(" ");
             b++;
        }
        }
        while(a < x){
            result.append(alice[a]).append(" ");
            a++;
        }
        while(b < y){
            result.append(bob[b]).append(" ");
            b++;
        }
        System.out.println(result);
    }
    
}
