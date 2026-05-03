package com.zhuhua100.string_code.test2;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        System.out.println("大写字母字符出现的次数是："+upper(str)+"\n"+
                           "小写字母字符出现的次数是："+lower(str)+"\n"+
                           "数字字符出现的次数是："+digit(str));
    }

    private static int upper(String string){
        int sum=0;
        for (int i = 0; i < string.length(); i++) {
            if('A'<=string.charAt(i)&&string.charAt(i)<='Z'){
                sum++;
            }
        }
        return sum;
    }

    private static int lower(String string){
        int sum=0;
        for (int i = 0; i < string.length(); i++) {
            if('a'<=string.charAt(i)&&string.charAt(i)<='z'){
                sum++;
            }
        }
        return sum;
    }

    private static int digit(String string){
        int sum=0;
        for (int i = 0; i < string.length(); i++) {
            if('0'<=string.charAt(i)&&string.charAt(i)<='9'){
                sum++;
            }
        }
        return sum;
    }
}
