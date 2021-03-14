package com.mundane.factorymethod.order;

import com.mundane.factorymethod.pizza.BJCheesePizza;
import com.mundane.factorymethod.pizza.BJPepperPizza;
import com.mundane.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
