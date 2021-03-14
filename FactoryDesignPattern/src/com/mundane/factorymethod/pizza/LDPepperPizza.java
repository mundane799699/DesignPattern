package com.mundane.factorymethod.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒");
        System.out.println("为伦敦的胡椒披萨准备材料");
    }
}
