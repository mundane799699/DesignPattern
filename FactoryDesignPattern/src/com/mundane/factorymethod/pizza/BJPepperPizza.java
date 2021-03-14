package com.mundane.factorymethod.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒");
        System.out.println("为北京的胡椒披萨准备材料");
    }
}
