package creational.factory.pizza.vietnam;

import creational.factory.pizza.EPizza;
import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;

public class PizzaVietNamStore extends PizzaStore {
    @Override
    protected Pizza createPizza(EPizza type) {
        switch (type) {
            case type.SEAFOOD -> {
                return new PizzaSeaFood();
            }
        }
        return null;
    }


}
