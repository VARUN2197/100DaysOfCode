import java.util.*;

public class DepthFirstSearch {
    private static int V;
    private static LinkedList<Integer> adj[];

    DepthFirstSearch (int v){
        V = v;
        adj = new LinkedList[V];
        for(int i=0;i<V;i++){
            adj[i] = new LinkedList();
        }
    }

    static void addEdge(int u,int v){
        adj[u].add(v);
    }

    void DFS(int s){
        boolean visited[] = new boolean[V];
        DFSPrint(s,visited);
    }

    void DFSPrint(int n,boolean visited[]){
        visited[n] = true;
        System.out.print(n + " ");
        Iterator<Integer> i = adj[n].listIterator();
        while(i.hasNext()){
            int s = i.next();
            if(!visited[s]){
                DFSPrint(s,visited);
            }
        }
    }

    public static void main(String args[]){
        DepthFirstSearch g = new DepthFirstSearch(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.DFS(2);
    }


}
