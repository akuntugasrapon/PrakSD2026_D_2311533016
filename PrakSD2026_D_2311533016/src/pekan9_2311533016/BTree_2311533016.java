package pekan9_2311533016;

public class BTree_2311533016 {

    private Node_2311533016 root;
    private Node_2311533016 currentNode;

    public BTree_2311533016() {
        root = null;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node_2311533016 node, int data) {

        if (node == null)
            return false;

        if (node.getData() == data)
            return true;

        if (node.getLeft() != null)
            if (search(node.getLeft(), data))
                return true;

        if (node.getRight() != null)
            if (search(node.getRight(), data))
                return true;

        return false;
    }

    public void printInOrder() {
        root.printInOrder(root);
    }

    public void printPreOrder() {
        root.printPreOrder(root);
    }

    public void printPostOrder() {
        root.printPostOrder(root);
    }

    public Node_2311533016 getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node_2311533016 node) {

        int count = 1;

        if (node == null) {
            return 0;
        } else {
            count += countNodes(node.getLeft());
            count += countNodes(node.getRight());
            return count;
        }
    }

    public void print() {
        root.print();
    }

    public Node_2311533016 getCurrent() {
        return currentNode;
    }

    public void setCurrent(Node_2311533016 node) {
        this.currentNode = node;
    }

    public void setRoot(Node_2311533016 root) {
        this.root = root;
    }
}
