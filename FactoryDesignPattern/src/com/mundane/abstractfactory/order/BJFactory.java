package com.mundane.abstractfactory.order;

import com.mundane.abstractfactory.pizza.BJCheesePizza;
import com.mundane.abstractfactory.pizza.BJPepperPizza;
import com.mundane.abstractfactory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
