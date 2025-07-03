import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++){
            int x = sc.nextInt();
            int [] arr = new int[x];
            for(int i = 0; i < x; i++){
                arr[i] = sc.nextInt();
            }
            boolean isndec = true;
            for(int i = 0; i < x - 1; i++){
                if (arr[i] > arr[i + 1]) {
                    isndec = false;
                    break;
                }

   }
            if(isndec) System.out.println("YES");
            else System.out.println("NO");        
  }
  sc.close();
}
}
