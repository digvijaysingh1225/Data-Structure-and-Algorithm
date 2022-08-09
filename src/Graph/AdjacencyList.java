package Graph;

import java.util.*;

public class AdjacencyList {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        adjacencyList(sc,sc.nextInt(),sc.nextInt());
//    }
//    public static void adjacencyList(Scanner sc,int m,int n){
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            adj.add(new ArrayList<>());
//
//        }
//        int u,v;
//        for (int i = 0; i < m; i++) {
//            u=sc.nextInt();
//            v=sc.nextInt();
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//        }
//        System.out.println(adj);
//    }


    Map<Integer, LinkedList<Integer>> obj;
    public AdjacencyList(){
        obj= new HashMap<>();
    }
    public void addEdge(int v1,int v2,boolean isbidirectional){
        LinkedList<Integer> v1neighbour = obj.getOrDefault(v1,new LinkedList<>());
        v1neighbour.add(v2);
        obj.put(v1,v1neighbour);
        if(isbidirectional){
            LinkedList<Integer> v2neighbour =obj.getOrDefault(v2,new LinkedList<>());
            v2neighbour.add(v1);
            obj.put(v2,v2neighbour);
        }
    }



    public static void main(String[] args) {
        AdjacencyList g = new AdjacencyList();
        g.addEdge(0,1,true);
        g.addEdge(0,3,true);
        g.addEdge(0,8,true);
        g.addEdge(1,7,true);
        g.addEdge(2,3,true);
        g.addEdge(2,5,true);
        g.addEdge(2,7,true);
        g.addEdge(3,4,true);
        g.addEdge(4,8,true);
        g.addEdge(5,6,true);
    }
}
