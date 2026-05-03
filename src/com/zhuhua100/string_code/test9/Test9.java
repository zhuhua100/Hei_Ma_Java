package com.zhuhua100.string_code.test9;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project 字符串打乱
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i]=str.charAt(i);
        }
        int op0,op1;
        char op;
        Random random=new Random();
        for (int i = 0; i < chars.length*100; i++) {
            op0=random.nextInt(0,chars.length);
            op1=random.nextInt(0,chars.length);
            op=chars[op0];
            chars[op0]=chars[op1];
            chars[op1]=op;
        }
        System.out.println(String.valueOf(chars));
    }
}
