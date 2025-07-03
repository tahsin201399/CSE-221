import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
            for(int t = 0; t < T; t++){
            String line = sc.nextLine();
            int len = line.length();
            int i = 0;

            while(i < len && (line.charAt(i) < '0' || line.charAt(i) > '9')){
                i++;
            }

            int num1 = 0;
            while(i < len){
                char ch = line.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    num1 = num1 * 10 + (ch - '0');
                    i++;
                } 
                else{
                    break;
                }
            }

            while(i < len && line.charAt(i) == ' '){
                i++;
            }

            char op = line.charAt(i);
            i++;

            while(i < len && line.charAt(i) == ' '){
                i++;
            }

            int num2 = 0;
            while (i < len){
                char ch = line.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    num2 = num2 * 10 + (ch - '0');
                    i++;
                }
                else{
                    break;
                }
            }
            double result =0.0;
            if (op == '+') result =num1+ num2;
            else if(op == '-') result =num1 - num2;
            else if(op == '*') result =num1 *num2;
            else if(op == '/') result =(double)num1/ num2;

            System.out.printf("%.6f\n", result);
        }
        sc.close();
    }
}
