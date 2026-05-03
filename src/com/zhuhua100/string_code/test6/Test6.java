package com.zhuhua100.string_code.test6;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project 身份证推出身份信息
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println("请输入你的大陆身份证：");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
        if(str.length()!=18){
            System.out.println("出错！");
            return;
        }
        String[] str0=cut(str);
        sout(str0);
    }

    public static String[] cut(String str){
        String province=str.substring(0,2);
        String city=str.substring(2,4);
        String county=str.substring(4,6);
        String year=str.substring(6,10);
        String month=str.substring(10,12);
        String day=str.substring(12,14);
        String birthQ=str.substring(14,16);
        String gender=str.substring(16,17);
        String jiaoyan=str.substring(17,18);
        String[] str0={province,city,county,year,month,day,birthQ,gender,jiaoyan};
        return str0;
    }

    public static void sout(String[] str){
        if(Integer.parseInt(str[7])%2==0){
            System.out.println("她的生日是"+str[3]+"年"+str[4]+"月"+str[5]+"日。");
        }
        else{
            System.out.println("他的生日是"+str[3]+"年"+str[4]+"月"+str[5]+"日。");
        }
    }
}
