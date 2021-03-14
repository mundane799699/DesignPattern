package com.mundane.abstractfactory.order;


import com.mundane.abstractfactory.pizza.LDCheesePizza;
import com.mundane.abstractfactory.pizza.LDPepperPizza;
import com.mundane.abstractfactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
