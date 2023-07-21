public class Tree {
    private Node node;
    private Tree low;
    private Tree high;

    /**
     Constructor
     */
    public Tree(Node node) {
        this.node = node;
    }

    /**
     Getters and Setters
     */

    public void setNode(Node node) {
        this.node = node;
    }

    public void setLow(Tree low) {
        this.low = low;
    }

    public void setHigh(Tree high) {
        this.high = high;
    }

    public Node getNode() {
        return node;
    }

    public Tree getLow() {
        return low;
    }

    public Tree getHigh() {
        return high;
    }
}
