package com.zhuhua100.string_code.test3;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test3 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        char[] c=new char[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            c[i]=(char) (arr[i]+'0');
//        }
//        String str=new String(c);
//        System.out.println(str);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str=scanner.next();
        char[] c=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[str.length()-1-i]=str.charAt(i);
        }
        str=new String(c);
        System.out.println();
        System.out.println(str);
    }
}
