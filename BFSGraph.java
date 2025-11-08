import java.util.*;

public class BFSGraph {

    public static List<Integer> bfs( List<List<Integer>> graph, int source){

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.size()];

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            result.add(node);
            for(Integer AdjNode: graph.get(node)  ){
                if(!visited[AdjNode]){
                    visited[AdjNode] = true;
                    queue.add(AdjNode);
                }
            }
            
        }


        return result;
    }

    public static void main(String[] args) {
        
        List<List<Integer>> graph = new  ArrayList<>();

        graph.add(Arrays.asList(2,3,1));
        graph.add(Arrays.asList(0));
        graph.add(Arrays.asList(0,4));
        graph.add(Arrays.asList(0));
        graph.add(Arrays.asList(2));

        System.out.println(graph);

        int source = 0;
        List<Integer> result = bfs(graph,  source);

        System.out.println(result);



    }
    
}
