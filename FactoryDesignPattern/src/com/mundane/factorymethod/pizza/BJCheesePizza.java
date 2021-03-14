package com.mundane.factorymethod.pizza;


public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪");
        System.out.println("为北京的奶酪披萨准备材料");
    }
}
