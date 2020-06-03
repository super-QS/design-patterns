package com.design.deepclone;

public class Cilent {
    public static void main(String[] args) {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.setName("松江");
        deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("大于", "大于类"));
        // 深拷贝  方式一
//        DeepProtoType deepProtoType1 =  deepProtoType.clone()
        // 深拷贝  方式二 （推荐使用）
        DeepProtoType deepProtoType1 =  deepProtoType.deepClone();
        System.out.println("deepProtoType.getDeepCloneableTarget().hashCode() = " + deepProtoType.getDeepCloneableTarget().hashCode());
        System.out.println("deepProtoType1.getDeepCloneableTarget().hashCode() = " + deepProtoType1.getDeepCloneableTarget().hashCode());

        System.out.println("deepProtoType = " + deepProtoType);
        System.out.println("deepProtoType1 = " + deepProtoType1);


    }
}
