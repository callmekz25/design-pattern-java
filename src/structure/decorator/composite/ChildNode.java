package structure.decorator.composite;

public class ChildNode extends Node{


    public ChildNode(int value) {
        super(value);
    }

    @Override
    public void display() {
        if(left != null) {
            left.display();
        }
        System.out.print(" " + value);
        if(right != null) {
            right.display();

        }

    }

    @Override
    public void addLeft(Node n) {
        left = n;
    }

    @Override
    public void addRight(Node n) {
        right = n;
    }
}
