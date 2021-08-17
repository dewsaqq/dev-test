package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Graph graph = new UndirectedGraph();
        Scanner scanner = new Scanner(System.in);
        int numberOfEdges;

        System.out.print("Enter number of edges: ");
        numberOfEdges = scanner.nextInt();

        System.out.println("Enter pairs of vertices: ");
        for(int i = 0; i < numberOfEdges; i++) {
            graph.addEdge(Node.getInstance(scanner.nextInt()), Node.getInstance(scanner.nextInt()));
        }

        //graph.printGraphData(); //for better representation
        System.out.println(graph.countNumberOfSubgraphs());
    }
}
