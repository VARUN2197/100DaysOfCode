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


    public static void linkedLisPrint(LinkedListNode head) {
        LinkedListNode cur = head;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void delete(LinkedListNode head, int x) {
        LinkedListNode temp = head;
        LinkedListNode prev = null;
        if(temp != null && temp.data == x) {
            head = temp.next;
        }
        while (temp != null && temp.data != x) {
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) {
            return;
        }
        prev.next  = temp.next;
    }

    public static int length(LinkedListNode head){
        if(head==null){
            return 1;
        }
        int length = length(head.next);
        length = length +1;
        return  length;
    }

    public static int getMiddleNodeValue(LinkList list) {
        if(list.head==null) {
            return -1;
        }
        LinkedListNode slow = list.head;
        LinkedListNode fast = list.head;
        while(fast!= null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;

    }

    public static LinkList getRevevrseList(LinkList list) {
        if(list.head==null) {
            return null;
        }
        LinkedListNode cur = list.head;
        LinkedListNode prev = null;
        LinkedListNode after = cur.next;
        while(cur.next != null) {
            after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;
        }
        return list;
    }

    public static LinkedListNode getReverseTillPoint(LinkList list, int k){
        if(list.head==null) {
            return null;
        }
        LinkedListNode cur = list.head;
        LinkedListNode prev = null;
        LinkedListNode after = null;
        int count=0;
        while(cur!=null && count<k){
            after = cur.next;
            cur.next = prev;
            prev = cur;
            cur = after;
            count++;
        }
        if(after!=null){
            list.head.next = getReverseTillPoint(list,k);
        }
        return prev;
    }

    public static void main(String args[]) {
        LinkList list = new LinkList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        //System.out.println(l);
        linkedLisPrint(list.head);
       // delete(list.head, 2);
        //linkedLisPrint(list.head);
        int lh = length(list.head);
       // System.out.println(lh);
        int middleValue = getMiddleNodeValue(list);
        //System.out.println("Middle Value:" + middleValue);
        //out.println("Reversed list:");
        getRevevrseList(list);
        getReverseTillPoint(list, 3);
        linkedLisPrint(list.head);

        

    }
}
