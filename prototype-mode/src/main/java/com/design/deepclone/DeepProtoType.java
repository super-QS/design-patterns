package com.design.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
        super();
    }

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


    /**
     * 方式一：深拷贝，使用 clone() 方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        Object deep = null;
        DeepProtoType deepProtoType = null;
        try {
            //完成对基本数据类型、字符串等的 clone()
            deep = super.clone();
            deepProtoType = (DeepProtoType) deep;
            //对引用类型的属性进行单独处理
            deepProtoType.setDeepCloneableTarget((DeepCloneableTarget) deepCloneableTarget.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepProtoType;
    }


    /**
     * 方式二：通过对象实例化实现(推荐)
     *
     * @return
     */


    public DeepProtoType deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //将当前对象以对象流的方式输出
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
            return deepProtoType;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (bos != null) {
                    bos.close();
                }
                if (ois != null) {
                    ois.close();
                }
                if (bis != null) {
                    bis.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }
}
