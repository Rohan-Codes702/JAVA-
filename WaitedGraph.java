package GraphDataStructure;

import java.util.*;

public class WaitedGraph {
     static class edge1
    {
        int src;
        int desti;
        int wt;

        edge1(int src,int desti,int wt)
        {
            this.desti=desti;
            this.src=src;
            this.wt=wt;
        }

    }
    public static void creategraph(ArrayList<edge1>[] graph)
    {
        for (int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<edge1>();
        }

        graph[1].add(new edge1(1,2,5));
        graph[2].add(new edge1(2,3,3));
        graph[1].add(new edge1(1,3,2));

    }

    public static void main(String[] args) {
        int v=3;
        ArrayList<edge1>[] graph =new ArrayList[v];
        creategraph(graph);

        for (int i=0;i<graph[1].size();i++)
        {
            edge1 e=graph[1].get(i);
            System.out.println(e.src+" "+e.desti+" "+e.wt+" ");
        }
    }
}
