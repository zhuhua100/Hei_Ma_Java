package com.zhuhua100.intrface.test2;

/**
 * @author jyf31
 * @date 2026/5/5
 * @project Hei_Ma_Java
 */
public class Outer {
    private int a = 10;
    class Inner{
        private int a = 20;
        public void show(){
            int a=30;
            System.out.println(Outer.this.a);//10
            System.out.println(this.a);//20
            System.out.println(a);//30
        }
    }
}
