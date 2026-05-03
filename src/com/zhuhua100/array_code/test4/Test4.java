package com.zhuhua100;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author jyf31
 * @date 2026/4/30
 * @project Hei_Ma_Java
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入投注的6个红球号码1-33：");
        int[] red=new int[6];
        for (int i = 0; i < 6; i++) {
            red[i]=scanner.nextInt();
        }
        System.out.println("请输入投注的1个黑球号码1-16：");
        int blue= scanner.nextInt();
        cc(red,blue);
    }
    public static void cc(int[] red,int blue){
        Random random=new Random();
        Set<Integer> red0=new HashSet<>();
        while(red0.size()<6)
        {
            red0.add(random.nextInt(33)+1);
        }
        int blue0=random.nextInt(16)+1;
        int sum0=0;
        int sum1=0;
        if(blue==blue0)sum0+=1;
        for (int i = 0; i < 6; i++) {
            if(red0.contains(red[i])){
                sum1+=1;
            }
        }
        if(sum0==1&&(sum1==0||sum1==1)){
            System.out.println("恭喜你，赢得5元。");
        } else if ((sum0==1&&(sum1==2||sum1==3))||(sum0==0&&sum1==4)) {
            System.out.println("恭喜你，赢得10元。");
        } else if ((sum0==1&&sum1==4)||(sum0==0&&sum1==5)) {
            System.out.println("恭喜你，赢得200元。");
        } else if (sum0==1&&sum1==5) {
            System.out.println("恭喜您，赢得3000元。");
        } else if (sum0==0&&sum1==6) {
            System.out.println("热烈恭喜您，赢得最高500万元大奖。");
        } else if (sum0==1&&sum1==6) {
            System.out.println("热烈祝贺您，赢得最高1000万元超级大奖。");
        }else{
            System.out.println("抱歉，下回一定。");
        }
    }
}
