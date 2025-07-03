import java.util.Scanner;
public class Task1{
    public static void  main(String [] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
 
    for(int i = 0 ; i <T;i++){
 
       int X = sc.nextInt();
 
       if(X%2==0){
        System.out.println(X + " is an Even number.");
       }
       else System.out.println(X +" is an Odd number.");
    }
 sc.close();
}
}