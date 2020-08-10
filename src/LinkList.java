import java.util.LinkedList;

public class LinkList {
    LinkedListNode head = null;

    public static LinkList insert(LinkList list, int x) {

        LinkedListNode temp = new LinkedListNode(x);
        if(list.head == null) {
            list.head = temp;
        } else {
            LinkedListNode cur = list.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = temp;

        }
        return list;
    }

    public static int linkedListLength(LinkedListNode head) {
        int length = 0;
        LinkedListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        return length;
    }

    public static void main(String args[]) {
        LinkList list = new LinkList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        int l = linkedListLength(list.head);
        System.out.println(l);
    }
}
