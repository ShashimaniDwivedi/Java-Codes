import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int V;
    private LinkedList<Integer>adj[];
   @SuppressWarnings("unchecked") public DFS(int v)
    {
       V=v;
       adj=new LinkedList[v];
       for(int i=0;i<v;++i)
       {
           adj[i]=new LinkedList<>();
       }
    }
    public void addEdge(int v,int u)
    {
        adj[v].add(u);

    }
    public void dfsTraversal(int v,boolean[]visited) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> itr = adj[v].listIterator();
        while (itr.hasNext()) {
           int n= itr.next();
           if(!visited[n])
           {
               dfsTraversal(n,visited);
           }
        }
    }
    public static void main(String[] args) {
       int v=4;
       DFS dfs=new DFS(v);
     boolean[]visited =new boolean[v];
     dfs.addEdge(0,1);
     dfs.addEdge(0,2);
     dfs.addEdge(1,2);
     dfs.addEdge(2,0);
     dfs.addEdge(3,3);
     dfs.addEdge(2,3);
     System.out.println("DFS From vertex 1");
     dfs.dfsTraversal(1,visited);
    }
}
