import java.lang.*;

public class BinaryTreeHeight
{

    public static void main (String[] args) throws java.lang.Exception {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(19);
        int x = height(root);
        System.out.println(x);
    }

    private static int height(Node root) {
        if(root==null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int h;
        if(lh>rh) {
            h = lh+1;
        } else {
            h = rh +1;
        }
        return h;
    }
}
