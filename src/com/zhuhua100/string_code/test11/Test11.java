package com.zhuhua100.string_code.test11;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project 使用字符串完成大位乘法
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个非负整数：");
        String str1=scanner.next();
        String str2=scanner.next();
        String str = multi(str1,str2);
        System.out.println("乘积是："+str);
    }

    public static String multi(String str1,String str2){
        // 处理乘数为0的情况
        if (str1.equals("0") || str2.equals("0")) {
            return "0";
        }
        // 将字符串反转，使低位（个位）在索引0处，方便计算
        String s1 = new StringBuilder(str1).reverse().toString();
        String s2 = new StringBuilder(str2).reverse().toString();

        // 结果数组，最大长度为两个数长度之和
        int[] result = new int[s1.length() + s2.length()];

        // 逐位相乘
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                int product = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                result[i + j] += product;
                // 处理进位
                result[i + j + 1] += result[i + j] / 10;
                result[i + j] %= 10;
            }
        }

        // 将结果数组转换为字符串（去掉前导0）
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (leadingZero && result[i] == 0) {
                continue;
            }
            leadingZero = false;
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
