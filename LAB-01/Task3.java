import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < x; i++){
            int N = sc.nextInt();
            long sum = (long) N * (N + 1) / 2; //sum of the first N natural numbers
            System.out.println(sum);
        }
        sc.close();
    }
}
