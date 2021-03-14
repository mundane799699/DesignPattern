package com.mundane.factorymethod.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪");
        System.out.println("为伦敦的奶酪披萨准备材料");
    }
}
