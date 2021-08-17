package task3;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private static final Map<Integer, Node> nodes = new HashMap<>();
    private final int value;
    private boolean visited = false;

    private Node(int value) {
        this.value = value;
    }

    /* Simple singletons for each node */
    public static Node getInstance(int value) {
        if(nodes.containsKey(value)) return nodes.get(value);
        else {
            Node newNode = new Node(value);
            nodes.put(value, newNode);
            return newNode;
        }
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void visit() {
        visited = true;
    }

    public void refresh() {
        visited = false;
    }
}
