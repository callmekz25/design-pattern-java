package behavioral.strategy.duck_example_64cntt;

public class VitQuay extends Duck {
    public VitQuay(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);

    }

    @Override
    public void display() {
        System.out.println("Vit Quay Bac Kinh");
        this.swim();
        this.performFly();
        this.performQuack();
        System.out.println("Chuc ngon mieng!!");
    }

}
