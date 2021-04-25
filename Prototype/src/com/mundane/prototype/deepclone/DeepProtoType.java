package com.mundane.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepProtoType() {
    }

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    // 深拷贝, 方式一: 使用clone方法
    @Override
    protected DeepProtoType clone() throws CloneNotSupportedException {
        DeepProtoType deepProtoType = null;
        deepProtoType = (DeepProtoType) super.clone();
        deepProtoType.setDeepCloneableTarget(deepProtoType.getDeepCloneableTarget().clone());
        return deepProtoType;
    }

    // 深拷贝, 方式二: 通过对象的序列化(推荐)
    public DeepProtoType deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copy = (DeepProtoType) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
