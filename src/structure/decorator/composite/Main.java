package structure.decorator.composite;

public class Main {
    public static void main(String[] args) {
        Node ori = new ChildNode(10);
        Node leafLeft = new ChildNode(5);
        Node leafRight = new ChildNode(15);
        Node l1 = new LeafNode(1);
        Node l2 = new LeafNode(20);
        Node l3 = new LeafNode(8);
        Node l4 = new LeafNode(12);

        ori.addLeft(leafLeft);
        ori.addRight(leafRight);
        leafRight.addLeft(l3);
        leafRight.addRight(l4);
        leafLeft.addLeft(l2);
        leafLeft.addRight(l1);

        ori.display();
//        System.out.println();
//        leafLeft.display();

    }
}
