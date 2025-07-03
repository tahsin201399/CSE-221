import java.util.Scanner;

public class Task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr1 = new int[x];
        for(int i = 0; i < x; i++){
            arr1[i] =sc.nextInt();
        }
        boolean sort =true;
        while(sort){
            sort = false;
            for(int i = 0; i < x - 1; i++){
                if((arr1[i] % 2 == arr1[i+1] % 2)&&(arr1[i] > arr1[i+1])){
                    int temp = arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]= temp;
                    sort =true;
                }
            }
        }
        for(int i = 0; i < x; i++){
            System.out.print(arr1[i] + " ");
        }

        sc.close();
    }
}
