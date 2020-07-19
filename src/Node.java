import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node left;
    Node right;


    Node (int x) {
        this.data = x;
        right = null;
        left = null;
    }
    static Node Insert(Node root, int x) {
        Node temp = new Node(x);
        if(root==null) {
            return temp;
        }
        if(x<root.data) {
            root.left = Insert(root.left, x);
        } else{
            root.right = Insert(root.right, x);
        }
        return root;
    }
}

