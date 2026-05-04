package com.zhuhua100.intrface.test1;

/**
 * @author jyf31
 * @date 2026/5/4
 * @project Hei_Ma_Java
 */
public abstract class Yun extends Person {
    public Yun() {


    }

    public Yun(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}