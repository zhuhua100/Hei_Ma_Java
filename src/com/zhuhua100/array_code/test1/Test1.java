package com.zhuhua100.array_code.test1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author jyf31
 * @date 2026/4/30
 * @project Hei_Ma_Java
 */
public class Test1 {
    public static void main(String[] args) {
        //有六位评委，分数范围0~100之间整数
        //选手得分为去掉最高值和最低值后的平均分
        int[] score=new int[6];
        Random num=new Random();
        int m=0;
        int n=100;
        int sum=0;
        for (int i = 0; i < 6; i++) {
            score[i]=num.nextInt(101);
            sum+=score[i];
            if(score[i]>m){
                m=score[i];
            }
            if(score[i]<n){
                n=score[i];
            }
        }
        sum=sum-m-n;
        double sc=(double)sum/4;
        System.out.println("评委最大值为："+m);
        System.out.println("评委最小值为："+n);
        System.out.println("选手的得分为："+sc);
        System.out.println(Arrays.toString(score));
    }
}
