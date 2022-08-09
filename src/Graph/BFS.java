package Graph;

import java.util.*;

public class BFS {
    Map<Integer , LinkedList<Integer>> obj;
    public BFS(){
        obj = new HashMap<>();
    }
    public void bfsTraversal(int source){
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(source);
        Set<Integer> vis = new HashSet<>();
        vis.add(source);
        while(!bfs.isEmpty()){
            int front = bfs.poll();
            System.out.println(front);
            LinkedList<Integer> neighbourList = obj.get(front);
            for (int res:neighbourList) {
                if(!vis.contains(res)){
                    bfs.add(res);
                    vis.add(res);
                }
            }
        }
    }

}
