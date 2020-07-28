
import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        char[] a = st.toCharArray();
        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2 = new Stack<Character>();
        for(int i=0;i<st.length();i++) {
            st1.push(a[i]);
            //System.out.print(a[i]);
        }
        boolean flag = false;
        int q = st1.size();
        while(q>0) {
            while(!st1.isEmpty()) {
                char t = st1.peek();
                st1.pop();
                if(!st1.isEmpty()) {
                    char x = st1.peek();
                    if(t==x) {
                        st1.pop();
                        //flag = true;
                    } else {
                        st2.push(t);
                    }
                } else {
                    st2.push(t);
                }
            }
            if(st2.isEmpty()) {
                break;
            }
            while(!st2.isEmpty()) {
                st1.push(st2.peek());
                st2.pop();
            }
            q--;
        }
        if(st2.isEmpty()) {
            System.out.println("Empty String");
        }
        else {
            while(!st2.isEmpty()) {
                char c = st2.peek();
                st2.pop();
                System.out.print(c);
            }
        }

    }
}

