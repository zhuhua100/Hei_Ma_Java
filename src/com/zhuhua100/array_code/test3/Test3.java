package com.zhuhua100;

import java.util.Random;
import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/4/30
 * @project Hei_Ma_Java
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入要抽奖的次数：");
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        choujiang(num);
    }
    private static void choujiang(int num){
        int[] jiangxiang={2,588,888,1000,10000};
        Random ran=new Random();
        for (int i = 0; i < num; i++) {
            int num0= ran.nextInt(5);
            System.out.println(jiangxiang[num0]+"元的奖金被抽出。");
        }
    }
}
