package structure.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new Expresso("Cafe Expresso");
        b = new Milk("Ha Lan Milk", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());

        b = new Milk("Tho Milk", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());

        b = new Mocha("Mocha", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());

        b = new Whip("Whip", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());


    }
}
