package com.zhuhua100.intrface.test1;

/**
 * @author jyf31
 * @date 2026/5/4
 * @project Hei_Ma_Java
 */
public class BasketballJiao extends Jiao{
    public BasketballJiao() {
    }

    public BasketballJiao(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教打篮球。");
    }
}
