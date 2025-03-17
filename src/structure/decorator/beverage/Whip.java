package structure.decorator.beverage;

public class Whip extends CondimentDecorator{
    public Whip(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 3000;
    }
}
