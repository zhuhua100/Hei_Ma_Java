package com.zhuhua100.intrface.test1;

/**
 * @author jyf31
 * @date 2026/5/4
 * @project Hei_Ma_Java
 */
public class Test1 {
    public static void main(String[] args) {
        BasketballJiao bj=new BasketballJiao("张三",40);
        BasketballYun by=new BasketballYun("王五",24);
        PingpongJiao pj=new PingpongJiao("李二",35);
        PingpongYun py=new PingpongYun("赵六",25);

        System.out.println("-----------------------");
        System.out.println("这是篮球教练");
        System.out.println(bj.getName());
        System.out.println(bj.getAge());
        bj.teach();
        System.out.println("-----------------------");
        System.out.println("这是篮球运动员");
        System.out.println(by.getName());
        System.out.println(by.getAge());
        by.study();
        by.english();
        System.out.println("-----------------------");
        System.out.println("这是乒乓球教练");
        System.out.println(pj.getName());
        System.out.println(pj.getAge());
        bj.teach();
        System.out.println("-----------------------");
        System.out.println("这是乒乓球运动员");
        System.out.println(py.getName());
        System.out.println(py.getAge());
        py.study();
        py.english();
    }
}
