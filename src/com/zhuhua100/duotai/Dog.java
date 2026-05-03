package com.zhuhua100.duotai;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something){
        System.out.println("狗");
        System.out.println(this.getAge()+"岁的"+this.getColor()+"颜色的狗两只前腿死死的抱住骨头猛吃。");
    }

    public void lookHome(){
        System.out.println("狗会看家。");
    }
}
