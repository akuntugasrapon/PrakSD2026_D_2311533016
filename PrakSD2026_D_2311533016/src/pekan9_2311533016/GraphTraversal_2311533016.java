package pekan9_2311533016;

import java.util.*;

public class GraphTraversal_2311533016 {

    private Map<String, List<String>> graph = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1, String node2) {
        graph.putIfAbsent(node1, new ArrayList<>());
        graph.putIfAbsent(node2, new ArrayList<>());

        graph.get(node1).add(node2);
        graph.get(node2).add(node1);
    }

    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");

        for (String node : graph.keySet()) {
            System.out.print(node + " -> ");

            List<String> neighbors = graph.get(node);

            System.out.println(String.join(", ", neighbors));
        }

        System.out.println();
    }

    // DFS rekursif
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();

        System.out.println("Penelusuran DFS:");

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(String current,
                           Set<String> visited) {

        if (visited.contains(current))
            return;

        visited.add(current);

        System.out.print(current + " ");

        for (String neighbor :
                graph.getOrDefault(current,
                        new ArrayList<>())) {

            dfsHelper(neighbor, visited);
        }
    }

    public static void main(String[] args) {

        GraphTraversal_2311533016 graph =
                new GraphTraversal_2311533016();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");
        graph.addEdge("C", "F");
        graph.addEdge("E", "F");

        graph.printGraph();

        graph.dfs("A");
    }
}
