package com.zhuhua100.string_code.test5;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project 手机号中间隐私化
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入中国大陆手机号：");
        String str= scanner.next();
        if(str.length()!=11){
            System.out.println("出错！");
            return;
        }
        String str0=str.substring(0,3);
        str0=str0+"****"+str.substring(7);
        System.out.println("加密后电话号码为："+str0);
    }
}

