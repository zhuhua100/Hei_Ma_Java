package com.zhuhua100;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/4/30
 * @project Hei_Ma_Java
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入一个用于加密的数字：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("加密的密码为："+sort(num));
    }

    public static int sort(int num){
        int i=String.valueOf(num).length();
        int[] numm=new int[i];
        int end=0;
        for (int j = 0; j < i; j++) {
            numm[j]=num%10;
            numm[j]=(numm[j]+5)%10;
            end=end*10+numm[j];
            num=(num-num%10)/10;
        }
        return end;
    }
}
