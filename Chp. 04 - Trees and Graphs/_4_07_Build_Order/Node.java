package _4_07_Build_Order;

import java.util.ArrayList;

class Node { // public variables for convenience
    public String data;
    public Visited status;
    public ArrayList<Node> neighbors; // could alternatively use a HashSet (if I give nodes unique IDs)

    public Node(String data) {
        this.data = data;
        status = Visited.NEW;
        neighbors = new ArrayList<>();
    }

    public void addDirectedNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
