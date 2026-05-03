package com.zhuhua100.duotai;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Duotai {
    public static void main(String[] args) {
        Dog dog=new Dog(2,"黑");
        Cat cat=new Cat(1,"花");

        System.out.println();
        dog.lookHome();
        cat.catchMouse();

        System.out.println();
        Keeper keeper=new Keeper("张三",30);
        keeper.keepPet(dog,"肉");
        System.out.println();
        keeper.keepPet(cat,"鱼");
    }
}
