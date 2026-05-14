public class Experiment {

    public void runTraversals(Graph g) {

        long startBFS = System.nanoTime();
        g.bfs(0);
        long endBFS = System.nanoTime();

        long bfsTime = endBFS - startBFS;

        long startDFS = System.nanoTime();
        g.dfs(0);
        long endDFS = System.nanoTime();

        long dfsTime = endDFS - startDFS;

        System.out.println("BFS Time: " + bfsTime + " ns");
        System.out.println("DFS Time: " + dfsTime + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\n============================");
            System.out.println("Testing Graph Size: " + size);
            System.out.println("============================");

            Graph graph = createGraph(size);

            if (size == 10) {
                graph.printGraph();
            }

            runTraversals(graph);
        }
    }

    private Graph createGraph(int size) {

        Graph graph = new Graph();

        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        // Add edges
        for (int i = 0; i < size - 1; i++) {

            graph.addEdge(i, i + 1);

            // Additional connections
            if (i + 2 < size) {
                graph.addEdge(i, i + 2);
            }
        }

        return graph;
    }

    public void printResults() {

        System.out.println("\nExperiment completed successfully.");
    }
}