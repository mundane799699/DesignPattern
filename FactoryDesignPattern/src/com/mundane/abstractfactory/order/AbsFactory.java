package com.mundane.abstractfactory.order;


import com.mundane.abstractfactory.pizza.Pizza;

public interface AbsFactory {
    Pizza createPizza(String orderType);
}
