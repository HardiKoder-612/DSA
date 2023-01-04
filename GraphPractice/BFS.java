package GraphPractice;
// O(V+E)
import java.util.*;
import java.lang.*;

public class BFS {
    private int vertices;
    private LinkedList<Integer> adj[];
    BFS(int v)
    {
        vertices=v;
        adj=new LinkedList[v];
        for (int i = 0; i < adj.length; i++)
        {
            adj[i]=new LinkedList();
        }
    }
    public void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    public void search(int source)
    {
        boolean visited[]= new boolean[vertices];
        LinkedList<Integer> queue=new LinkedList<>();
        visited[source]=true;
        queue.add(source);
        while(queue.size()!=0)
        {
            source=queue.poll();
            System.out.print(source+" ");

            Iterator<Integer>itr=adj[source].iterator();

            while(itr.hasNext())
            {
                int n= itr.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BFS g=new BFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.search(2);

    }
}
