package task3;

public interface Graph {
    void addEdge(Node source, Node destination);
    int countNumberOfSubgraphs();
    void printGraphData();
}
