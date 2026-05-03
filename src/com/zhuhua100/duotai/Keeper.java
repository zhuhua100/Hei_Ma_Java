package com.zhuhua100.duotai;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Keeper {
    private String name;
    private int age;

    public Keeper() {
    }

    public Keeper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Dog dog,String something){
        String last_name=name.substring(0,1);
        System.out.println("年龄为"+this.age+"岁的老"+last_name+"养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗。");
        dog.eat(something);
    }

    public void keepPet(Cat cat,String something){
        String last_name=name.substring(0,1);
        System.out.println("年龄为"+this.age+"岁的老"+last_name+"养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫。");
        cat.eat(something);
    }
}
