package com.zhuhua100.intrface.test1;

/**
 * @author jyf31
 * @date 2026/5/4
 * @project Hei_Ma_Java
 */
public class PingpongJiao extends Jiao{
    public PingpongJiao() {
    }

    public PingpongJiao(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教打乒乓球。");
    }
}
