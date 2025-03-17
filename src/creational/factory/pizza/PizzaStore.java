package creational.factory.pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(EPizza type);
    public Pizza orderPizza(EPizza type) {
        if(type == null) {
            System.out.println("Chọn loại pizza");
        }
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
