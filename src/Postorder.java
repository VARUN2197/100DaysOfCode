import java.util.*;
import java.lang.*;

public class Postorder {

    public static void main (String[] args) throws java.lang.Exception
    {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(19);
        printPostOrder(root);
    }

    private static void printPostOrder(Node root) {
        if(root==null) {
            return;
        }
        Stack<Node> st = new Stack();
        Node cur = root;
        while(cur!=null) {
            cur = cur.left;
        }
    }
}
