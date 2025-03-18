package structure.composite;

public abstract class Node {
    Node left, right;
    int value;

    public Node(int value) {
        this.value = value;
    }

    abstract void  display();
    abstract void addLeft(Node n);
    abstract void addRight(Node n);
}
