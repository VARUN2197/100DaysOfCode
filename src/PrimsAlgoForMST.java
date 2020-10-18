import java.util.*;

public class PrimsAlgoForMST {
    private int V = 5;
    public static void main(String[] args)
    {
        /* Let us create the following graph
        2 3
        (0)--(1)--(2)
        | / \ |
        6| 8/ \5 |7
        | /     \ |
        (3)-------(4)
            9         */
        PrimsAlgoForMST t = new PrimsAlgoForMST();
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        // Print the solution
        t.primMST(graph);
    }
    void primMST(int graph[][]){
        int parent[] = new int[V];
        boolean mset[] = new boolean[V];
        int key[] = new int[V];
        for(int i=0;i<V;i++){
            mset[i] = false;
            key[i] = Integer.MAX_VALUE;
        }
        key[0] = 0;
        parent[0] = -1;
        for(int i=0;i<V-1;i++){
            int u = minset(key,mset);
            mset[u] = true;
            for(int v=0;v<V;v++){
                if(graph[u][v] != 0 && mset[v] == false && graph[u][v] < key[v]){
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }
        printMST(parent,graph);
    }
    int minset(int key[],boolean mset[]){
        int min = Integer.MAX_VALUE,min_index = -1;
        for(int i=0;i<V;i++){
            if(mset[i] == false && key[i] < min){
                min_index = i;
                min = key[i];
            }
        }
        return min_index;
    }
    void printMST(int parent[], int graph[][]){
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
}
