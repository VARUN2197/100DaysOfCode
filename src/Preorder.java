/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
/* Name of the class has to be "Main" only if the class is public. */

class Preorder
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(19);
        printPreOrder(root);
    }

    static void printPreOrder(Node root) {
        if(root==null) {
            return;
        }
        Stack<Node> st = new Stack();
        st.push(root);
        while(st.isEmpty()!= true) {
            Node cur = st.peek();
            st.pop();
            System.out.println(cur.data);
            if(cur.right!=null) {
                st.push(cur.right);
            }
            if(cur.left!=null) {
                st.push(cur.left);
            }
        }

    }
}
