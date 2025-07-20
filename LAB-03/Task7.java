import java.util.Scanner;
public class Task7 {
    static int postIndex;
    static int[] inOrder, postOrder;
    static class Node {
        int val;
        Node left, right;

        Node(int v) {
            val = v;
            left = right = null;
        }
    }
    public static Node buildTree(int inStart, int inEnd){
        if(inStart> inEnd) 
        return null;
        int rootVal = postOrder[postIndex--];
        Node root = new Node(rootVal);
        int rootIdx = search(inOrder, inStart, inEnd, rootVal);
        root.right = buildTree(rootIdx + 1, inEnd);
        root.left = buildTree(inStart, rootIdx - 1);
        return root;
    }
    public static void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int search(int[] arr, int start, int end, int target){
        for(int i = start; i <= end; i++){
            if(arr[i] == target) 
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inOrder =new int[n];
        postOrder= new int[n];
        for (int i= 0; i <n; i++) inOrder[i] = sc.nextInt();
        for (int i =0; i <n; i++) postOrder[i]= sc.nextInt();
        postIndex = n - 1;
        Node root =buildTree(0, n - 1);
        preOrder(root);
        sc.close();
    }
    
}

