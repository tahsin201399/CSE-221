import java.util.Scanner;
public class Task6{
    static int pindx = 0;
    static class Node{
        int val;
        Node left, right;

        Node(int v){
            val = v;
            left = right = null;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inOrder = new int[n];
        int[] preOrder = new int[n];
        for(int i = 0; i < n; i++){
            inOrder[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            preOrder[i] = sc.nextInt();
        }
        Node root = buildTree(inOrder, preOrder, 0, n - 1);
        postOrder(root);
        sc.close();
    }
    public static Node buildTree(int[] inOrder, int[] preOrder, int inStart, int inEnd) {
        if(inStart > inEnd){
            return null;
        }
        int rootvalue = preOrder[pindx++];
        Node root = new Node(rootvalue);
        int rootindx = search(inOrder, inStart, inEnd, rootvalue);
        root.left = buildTree(inOrder, preOrder, inStart, rootindx - 1);
        root.right = buildTree(inOrder, preOrder, rootindx + 1, inEnd);
        return root;
    }
    public static int search(int[] inOrder, int strt, int end, int value){
        for(int i = strt; i <= end; i++){
            if(inOrder[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
}
