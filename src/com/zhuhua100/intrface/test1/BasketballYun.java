package com.zhuhua100.intrface.test1;

/**
 * @author jyf31
 * @date 2026/5/4
 * @project Hei_Ma_Java
 */
public class BasketballYun extends Yun implements English{
    public BasketballYun() {
    }

    public BasketballYun(String name, int age) {
        super(name, age);
    }

    @Override
    public void english() {
        System.out.println("篮球运动员在学英语。");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学打篮球。");
    }
}
