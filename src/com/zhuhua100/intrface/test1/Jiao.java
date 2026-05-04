package com.zhuhua100.intrface.test1;

/**
 * @author jyf31
 * @date 2026/5/4
 * @project Hei_Ma_Java
 */
public abstract class Jiao extends Person{
    public Jiao() {
    }

    public Jiao(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
