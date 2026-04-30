import java.util.*;

public class graphRepresentationAdjacancyList{
    public static void main(String[] args){

        int V = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0,1);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 2);
        addEdge(graph, 2, 0);
        
        printGraph(graph);        
    }

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> graph){
        for(int i=0; i<graph.size(); i++){
            System.out.print(i + " -> ");
            for(int n : graph.get(i)){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}