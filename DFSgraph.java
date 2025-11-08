import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;


public   class DFSgraph {

      static void dfs(int source, List<List<Integer>> graph,List<Integer> result,boolean isVisited[]){

        isVisited[source]= true;
        result.add(source);
        for(Integer node: graph.get(source)){

            if(!isVisited[node]){
                    dfs(node, graph, result, isVisited);
            }
        }


    }



    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i <=8; i++){
            graph.add(new ArrayList<>());
            
        }

        graph.get(1).addAll(Arrays.asList(2,3));
        graph.get(2).addAll(Arrays.asList(1,5,6));
        graph.get(3).addAll(Arrays.asList(1,4,7));
        graph.get(4).addAll(Arrays.asList(3,8));
        graph.get(5).addAll(Arrays.asList(2));
        graph.get(6).addAll(Arrays.asList(2));
        graph.get(7).addAll(Arrays.asList(3,8));
        graph.get(8).addAll(Arrays.asList(4,7));

        int source = 1;
        List<Integer> result = new ArrayList<>();
        boolean isVisited[] = new boolean[graph.size()+1]; 

        dfs(source,graph,result,isVisited);
        System.out.println(result);


    }
    
}
