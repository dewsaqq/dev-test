package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Graph graph = new UndirectedGraph();
        Scanner scanner = new Scanner(System.in);
        int numberOfEdges;

        System.out.print("Enter number of edges: ");
        numberOfEdges = scanner.nextInt();

        System.out.println("Enter pairs of vartices: ");
        for(int i = 0; i < numberOfEdges; i++) {
            graph.addEdge(Node.getInstance(scanner.nextInt()), Node.getInstance(scanner.nextInt()));
        }

        graph.printGraphData();
    }
}
