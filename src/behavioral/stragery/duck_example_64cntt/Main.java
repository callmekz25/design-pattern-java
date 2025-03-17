package behavioral.stragery.duck_example_64cntt;

public class Main {
    public static void main(String[] args) {
        Duck d = new VitQuay(new FlyWithWings(), new SQuack());
        d.setQuackBehavior(new MuteQuack());
        d.display();
    }
}
