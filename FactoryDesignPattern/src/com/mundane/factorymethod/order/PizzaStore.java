package com.mundane.factorymethod.order;

public class PizzaStore {
    public static void main(String[] args) {
        // 工厂方法模式：定一个创建对象的抽象方法，由子类决定要实例化的类，工厂方法模式将对象的实例化推迟到子类

        String location = "bj";
        if (location.equals("bj")) {
            // 创建北京口味的各种披萨
            new BJOrderPizza();
            System.out.println("退出了程序");
        } else if (location.equals("ld")) {
            // 创建伦敦口味的各种披萨
            new LDOrderPizza();
            System.out.println("退出了程序");
        }


    }
}
