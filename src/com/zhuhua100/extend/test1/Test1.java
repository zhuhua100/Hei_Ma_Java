package com.zhuhua100.extend.test1;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Test1 {
    public static void main(String[] args) {
        Manager man =new Manager("664535435","张三",4545,45445);
        System.out.println(man.getId()+','+man.getName()+','+man.getWage()+','+man.getManmoney());
        man.work();
        man.eat();
    }
}
