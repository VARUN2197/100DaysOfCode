public class DLL {
    DoubleLinkedList head = null;

    public static DLL insertAtEnd(DLL list, int x){
        DoubleLinkedList temp = new DoubleLinkedList(x);
        DoubleLinkedList cur = list.head;
        if(cur==null) {
            list.head = temp;
            return list;
        }
        while(cur.next!=null){
            cur.prev = cur;
            cur = cur.next;
        }
        cur.next = temp;
        temp.prev = cur;
        return list;
    }

    public static DLL insertAtStart(DLL list,int x){
        DoubleLinkedList temp = new DoubleLinkedList(x);
        if(list.head==null){
            list.head = temp;
            return list;
        }
        DoubleLinkedList cur = list.head;
        cur.prev = temp;
        temp.next = cur;
        temp.prev = null;
        list.head = temp;
        return list;
    }

    public static DLL insertBefore(DLL list,int y,int x){
        DoubleLinkedList temp = new DoubleLinkedList(x);
        DoubleLinkedList cur = list.head;
        DoubleLinkedList before = cur.prev;
        DoubleLinkedList after = cur.next;
        if(cur==null){
            cur = temp;
            return list;
        }
        while(cur!=null && cur.value!=y){
            after = cur.next;
            before = cur;
            cur = after;
        }
        temp.next = cur;
        cur.prev = temp;
        temp.prev = before;
        before.next = temp;
        return list;
    }

    public static void doubleLinkedListPrint(DLL list) {
        DoubleLinkedList cur = list.head;
        while (cur != null) {
            System.out.println(cur.value+ " ");
            cur = cur.next;
        }
    }

    public static DLL delete(DLL list, int x){
        if(list.head==null || list.head.value==x){
            list.head = list.head.next;
            return list;
        }
        DoubleLinkedList cur = list.head;
        DoubleLinkedList before = null;
        DoubleLinkedList after = null;

        while(cur!=null && cur.value!= x){
            after = cur.next;
            before = cur;
            cur = after;
            after = cur.next;
        }
        before.next = cur.next;
        after.prev = before;
        return list;
    }

    public static void main(String args[]){
        DLL list = new DLL();
        list = insertAtEnd(list, 1);
        list = insertAtEnd(list, 2);
        list = insertAtEnd(list, 3);
        list = insertAtEnd(list, 4);
        list = insertAtEnd(list, 5);
        list = insertAtEnd(list, 6);
        list = insertAtEnd(list, 7);
        list = insertAtEnd(list, 8);
        list = insertBefore(list, 6 , 9);
        list = insertAtStart(list, 0);
        list = insertBefore(list, 1 , 10);
        //doubleLinkedListPrint(list);
        delete(list,7);
        doubleLinkedListPrint(list);
    }
}
