package com.zhuhua100.demo.string;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class String1 {
    public static void main(String[] args) {
        String s1=new String("asd");
        String s2="asd";
        String s3="Asd";
        System.out.println("直接比");
        System.out.println(s1==s2);
        System.out.println();
        System.out.println("用equals方法");
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
