package com.mundane.abstractfactory.order;

public class PizzaStore {
    public static void main(String[] args) {
        // 抽象工厂模式：
        // 将工厂抽象成两层，抽象工厂和具体实现的工厂子类

        new OrderPizza(new BJFactory());
    }
}
