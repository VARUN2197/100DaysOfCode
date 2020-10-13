import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    private static int V;
    private static LinkedList<Integer> adj[];

    TopologicalSort(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int u,int v){
        adj[u].add(v);
    }

    void TLS(){
        Stack<Integer> st = new Stack();
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            visited[i] = false;
        }
        for(int i=0;i<V;i++){
            if(visited[i] == false){
                TopoSort(i,visited,st);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }

    void TopoSort(int n, boolean[] visited, Stack<Integer> st){
        visited[n] = true;
        Iterator<Integer> i = adj[n].listIterator();
        while(i.hasNext()){
            int x = i.next();
            if(!visited[x]){
                TopoSort(x,visited,st);
            }
        }
        st.push(n);
    }

    public static void main(String args[])
    {
        // Create a graph given in the above diagram
        TopologicalSort g = new TopologicalSort(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological "
                + "sort of the given graph");
        // Function Call
        g.TLS();
    }
}
