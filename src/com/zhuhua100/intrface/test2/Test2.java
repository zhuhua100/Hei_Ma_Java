package com.zhuhua100.intrface.test2;

/**
 * @author jyf31
 * @date 2026/5/5
 * @project Hei_Ma_Java
 */
public class Test2 {
    public static void main(String[] args) {
        Outer.Inner test=new Outer().new Inner();
        test.show();
    }
}
