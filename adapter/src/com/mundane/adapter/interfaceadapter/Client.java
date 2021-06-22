package com.mundane.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };

        // todo 把这个adapter传入到方法中当做参数去使用
    }
}
