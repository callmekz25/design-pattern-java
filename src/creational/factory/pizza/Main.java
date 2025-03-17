package creational.factory.pizza;

import creational.factory.pizza.vietnam.PizzaVietNamStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaVietNamStore();
        Pizza p = ps.orderPizza(EPizza.SEAFOOD);

        System.out.println(p.toString());

    }
}
