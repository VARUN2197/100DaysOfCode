import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class AlienDictionary {
    private static LinkedList<Integer> adj[];

    AlienDictionary(int v){
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList();
        }
    }

    static void addEdge(int x, int y){
        adj[x].add(y);
    }

    private int getNoofVertices(){
        return adj.length;
    }

    void TLS(){
        boolean visited[] = new boolean[getNoofVertices()];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<getNoofVertices();i++){
            visited[i] = false;
        }
        for(int i=0;i<getNoofVertices();i++){
            if(!visited[i]){
                topoSort(i,visited,st);
            }
        }
        while(!st.isEmpty()){
            System.out.print((char)(st.pop() + 'a') + " ");
        }
    }

    void topoSort(int n, boolean visited[], Stack<Integer> st){
        visited[n] = true;
        Iterator<Integer> i = adj[n].listIterator();
        while(i.hasNext()){
            int z = i.next();
            if(!visited[z]){
                topoSort(z,visited,st);
            }
            st.push(n);
        }
    }

    static void printOrder(String words[], int alpha){
        AlienDictionary g = new AlienDictionary(alpha);
        for(int i=0;i<words.length - 1;i++){
            String word1 = words[i];
            String word2 = words[i+1];
            for(int j=0;j<Math.min(word1.length(),word2.length());j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    addEdge(word1.charAt(j) - 'a', word2.charAt(j)- 'a');
                }
            }
        }
        g.TLS();
    }

    public static void main(String args[]){
        String words[] = {"caa", "aaa", "aab"};
        printOrder(words, 3);
    }
}
