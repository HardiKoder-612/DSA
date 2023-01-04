package GraphPractice;
// O(V+E)
import java.util.*;
import java.lang.*;

public class DFS {
    private int V;
    LinkedList<Integer> adj[];
    DFS(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i]=new LinkedList();
        }
    }
    public void addEdge(int e,int w)
    {
        adj[e].add(w);
    }
    public void DFSalgo(int source,boolean visited[])
    {
        visited[source]=true;
        System.out.print(source+" ");
        ListIterator<Integer> itr=adj[source].listIterator();
        while(itr.hasNext())
        {
            int n=itr.next();
            if(!visited[n])
                DFSalgo(n,visited);
        }
    }
    public void search(int source)
    {
        boolean visited[]=new boolean[V];
        DFSalgo(source,visited);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DFS g=new DFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.search(2);
    }
}
