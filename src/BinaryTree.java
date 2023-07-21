public class BinaryTree {
    private Tree root;

    /**
    Constructor
     */
    public BinaryTree(Tree root) {
        this.root = root;
    }

    /**
    addNode method gets a Node as input and add it in the right place in the Tree
     */

    public void addNode(Node node) {
        addNodeRec(node, this.getRoot());
    }

    /**
      addNodeRec method gets a Node and a tree as input and add it in the right place in the code ,
      otherwise it will call it self recursivly and give its high or low tree as parameter
    */

    private Tree addNodeRec(Node node, Tree tree) {
        if (tree == null) {
            return new Tree(node);
        } else if (tree.getNode().getKey() >= node.getKey()) {
            tree.setLow(addNodeRec(node, tree.getLow()));
        } else {
            tree.setHigh(addNodeRec(node, tree.getHigh()));
        }
        return tree;
    }

    /**
     search(Node) method gets a Node as input and search for it in the Tree.
     if it finds it , it will return the value of the searched Node,
     Otherwise it will return a Node that has -1 as key and as value
     */

    public int search(Node node) {
        return searchRec(node, this.getRoot());
    }

    /**
     searchRec(Node, Tree)  method gets a Node and a tree as input and search for the key of the node in the Tree.
     if it finds it , it will return the value of the searched Node,
     if it doesn't find it but there is still a sub tree it calls itself recursively
     Otherwise it will return a Node that has -1 as key and as value
     */
    private int searchRec(Node node, Tree tree) {
        if (tree == null) return -1;
        else if (tree.getNode().getKey() == node.getKey()) {
            return tree.getNode().getValue();
        } else if (tree.getNode().getKey() >= node.getKey()) {
            return searchRec(node, tree.getLow());
        } else {
            return searchRec(node, tree.getHigh());
        }
    }

    /**
     searchAndAddNode(Node) method gets a Node as input and search for it in the Tree.
     if it finds it , it will return the value of the searched Node,
     Otherwise it will add the Node in the Tree and return a Node that has -1 as key and as value
     */
    public int searchAndAddNode(Node node) {
        return searchAndAddNodeRec(node, this.getRoot()).getNode().getValue();
    }

    /**
     searchAndAddNode(Node) method gets a Node and a tree as input and search for the key of the node in the Tree.
     if it finds it ,it will return the searched Node,
     if it doesn't find it but there is still a sub tree it calls itself recursively
     Otherwise it will add the Node in the right place and return a Node that has -1 as key and as value
     */
    private Tree searchAndAddNodeRec(Node node, Tree tree) {
        if (node.getKey() > tree.getNode().getKey()) {
            if (tree.getHigh() == null) {
                tree.setHigh(new Tree(node));
                return new Tree(new Node(-1, -1));
            }
            return searchAndAddNodeRec(node, tree.getHigh());
        } else if (node.getKey() < tree.getNode().getKey()) {
            if (tree.getLow() == null) {
                tree.setLow(new Tree(node));
                return new Tree(new Node(-1, -1));
            }
            return searchAndAddNodeRec(node, tree.getLow());
        } else return tree;
    }


    /**
     Getters and Setters
     */
    public Tree getRoot() {
        return root;
    }

    public void setRoot(Tree root) {
        this.root = root;
    }

}
