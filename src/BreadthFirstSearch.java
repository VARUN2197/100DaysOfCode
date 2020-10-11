import java.util.*;
import java.io.*;

public class BreadthFirstSearch {
    public static int V;
    public static LinkedList<Integer> adj[];

    BreadthFirstSearch (int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++) {
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int u, int v){
        adj[u].add(v);
    }

    public static void BFS(int s){
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){//returns boolean
                int n = i.next();//returns value
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]){
        BreadthFirstSearch bfs = new BreadthFirstSearch(4);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);
        System.out.println("Breadth first search from node 2 is ");
        BFS(2);
    }
}
