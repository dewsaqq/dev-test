package task3;

import java.util.HashMap;
import java.util.Map;

/**
 * Class representing node in graph. It checks whether its value is positive or not and throws exception in second case.
 * It implements basic visitation methods and simple singletons for each node for clarity of testing, might be
 * subject to change.
 */
public class Node {
    private static final Map<Integer, Node> nodes = new HashMap<>();
    private final int value;
    private boolean visited = false;

    private Node(int value) {
        this.value = value;
    }

    /* Simple singletons for each node */
    public static Node getInstance(int value) {
        if(Integer.signum(value) != 1) throw new IllegalArgumentException();
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
