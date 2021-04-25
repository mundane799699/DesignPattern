package com.mundane.prototype.deepclone;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {


        DeepProtoType p = new DeepProtoType();
        p.setName("宋江");
        p.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "小牛"));

        // 方式一完成深拷贝
        DeepProtoType p2 = p.clone();
        DeepProtoType p3 = p.clone();
        DeepProtoType p4 = p.clone();
        DeepProtoType p5 = p.clone();

        // 方式二完成深拷贝
//        DeepProtoType p2 = p.deepClone();
//        DeepProtoType p3 = p.deepClone();
//        DeepProtoType p4 = p.deepClone();
//        DeepProtoType p5 = p.deepClone();


        System.out.println("p.name = " + p.getName() + ", p.getDeepCloneableTarget().hashCode() = "+p.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name = " + p2.getName() + ", p2.getDeepCloneableTarget().hashCode() = "+p2.getDeepCloneableTarget().hashCode());
        System.out.println("p3.name = " + p3.getName() + ", p3.getDeepCloneableTarget().hashCode() = "+p3.getDeepCloneableTarget().hashCode());
        System.out.println("p4.name = " + p4.getName() + ", p4.getDeepCloneableTarget().hashCode() = "+p4.getDeepCloneableTarget().hashCode());
        System.out.println("p5.name = " + p5.getName() + ", p5.getDeepCloneableTarget().hashCode() = "+p5.getDeepCloneableTarget().hashCode());

    }
}
