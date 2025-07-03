import java.util.Scanner;

public class Task7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] ID = new int[x];
        int[] mark = new int[x];
        for(int i = 0; i < x; i++){
            ID[i] = sc.nextInt();
        }
        for(int i = 0; i < x; i++){
            mark[i] = sc.nextInt();
        }
        int swapCount = 0;
        for(int i = 0; i < x - 1; i++){
            int maxindx = i;
            for(int j = i + 1; j < x; j++){
                if(mark[j] > mark[maxindx]){
                    maxindx = j;
                }
                else if(mark[j] == mark[maxindx] && ID[j] < ID[maxindx]){
                    maxindx = j;
                }
            }
            if(maxindx != i){
                int tmark = mark[i];
                mark[i] = mark[maxindx];
                mark[maxindx] = tmark;
                //IDS
                int tid = ID[i];
                ID[i] = ID[maxindx];
                ID[maxindx] = tid;
                swapCount++;
            }
        }
        System.out.println("Minimum swaps: " + swapCount);
        for(int i = 0; i < x; i++){
            System.out.println("ID: " +ID[i]+" Mark: " +mark[i]);
        }
        sc.close();
    }
}
