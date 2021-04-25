package com.mundane.prototype.improve;


public class Client {
    public static void main(String[] args) {

        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();

        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep3 = " + sheep3);
        System.out.println("sheep4 = " + sheep4);
        System.out.println("sheep5 = " + sheep5);

    }
}
