package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class PizzaSeaFood extends Pizza {


    public PizzaSeaFood() {
    }

    @Override
    public void prepare() {
        this.getBuilder().append("Bột mì, hải sản, gia vị");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\nNướng trên 15 phút");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\nCắt thành 4 miếng");
    }

    @Override
    public void box() {
        this.getBuilder().append("\nĐóng hộp");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public StringBuilder getBuilder() {
        return super.getBuilder();
    }
}
