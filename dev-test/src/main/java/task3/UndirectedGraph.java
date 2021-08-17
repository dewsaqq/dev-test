package task3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UndirectedGraph implements Graph {
    private final Map<Node, LinkedList<Node>> adjacencyList;

    public UndirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(Node source, Node destination) {
        adjacencyList.putIfAbsent(source, new LinkedList<>(List.of(destination)));
        if(!adjacencyList.get(source).contains(destination)) {
            adjacencyList.get(source).add(destination);
        }

        adjacencyList.putIfAbsent(destination, new LinkedList<>(List.of(source)));
        if(!adjacencyList.get(destination).contains(source)) {
            adjacencyList.get(destination).add(source);
        }
    }

    public int countNumberOfSubgraphs() {
        int counter = 0;

        for(Node node : adjacencyList.keySet()) {
            if(!node.isVisited()) {
                dfs(node);
                counter++;
            }
        }

        refreshNodes();
        return counter;
    }

    /* Depth First Search */
    private void dfs(Node node) {
        node.visit();

        for(Node nextNode : adjacencyList.get(node)) {
            if(!nextNode.isVisited()) {
                dfs(nextNode);
            }
        }
    }

    private void refreshNodes() {
        adjacencyList.keySet().forEach(Node::refresh);
    }

    private void printAdjacencyList() {
        adjacencyList.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public void printGraphData() {
        System.out.println("Graph Structure");
        System.out.println("===============");
        printAdjacencyList();
        System.out.println("===============");
        System.out.println("Number of subgraphs: " + countNumberOfSubgraphs());
    }
}
