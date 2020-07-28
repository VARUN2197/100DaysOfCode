import java.lang.*;

public class BSTSumRootToLeaf
{

    public static void main (String[] args) throws java.lang.Exception {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(19);
        int x = sum(root);
        System.out.println(x);
    }

    private static int sum(Node root) {
        if(root==null)  {
            return 0;
        }
        int sl = sum(root.left);
        int sr = sum(root.right);
        int sum;
        if(sl>sr) {
            sum = sl + root.data;
        } else {
            sum = sr + root.data;
        }
        return sum;
    }
}