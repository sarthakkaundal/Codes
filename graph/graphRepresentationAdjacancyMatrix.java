
public class graphRepresentationAdjacancyMatrix{
    public static void main(String[] args){
        int V = 4;
        int[][] graph = new int[V][V];

        addEdge(graph, 0,1);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 2);
        addEdge(graph, 2, 0);

        printGraph(graph);
    }

    static void addEdge(int[][] graph, int u, int v){
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    static void printGraph(int[][] graph){
        for(int[] row : graph){
            for(int el : row){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
