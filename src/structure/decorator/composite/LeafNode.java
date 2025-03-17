package structure.decorator.composite;

public class LeafNode extends Node {


    public LeafNode(int value) {
        super(value);
    }

    @Override
    public void display() {
        System.out.print(" " + value);
    }

    @Override
    public void addLeft(Node n) {

    }

    @Override
    public void addRight(Node n) {

    }


}
