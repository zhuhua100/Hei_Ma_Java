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

    public void keepPet(Animal animal,String something){
        String last_name=name.substring(0,1);
        System.out.print("年龄为"+this.age+"岁的老"+last_name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的");
        animal.eat(something);
    }
}
