package com.zhuhua100.regex;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/5
 * @project 使用正则表达式匹配电话号，座机号码和邮箱
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入你要匹配格式的电话号码，座机号码或者邮箱。");
        Scanner scanner=new Scanner(System.in);
        String str = "";
        th:
        while(true){
            System.out.println("请问你要匹配哪种？（退出请按i）");
            str=scanner.next();
            switch(str){
                case "电话号码":
                case "电话":
                    System.out.println("请输入：");
                    str=scanner.next();
                    if(str.matches("[1][3-9][0-9]{9}")){
                        System.out.println("匹配成功！");
                    }else{
                        System.out.println("匹配失败！");
                    }
                    break ;
                case "座机":
                case "座机号码":
                    System.out.println("请输入：");
                    str=scanner.next();
                    if(str.matches("[0][0-9]{3,4}[-][0-9]{7,8}")){
                        System.out.println("匹配成功！");
                    }else{
                        System.out.println("匹配失败！");
                    }
                    break ;
                case "邮箱":
                case "电子邮箱":
                    System.out.println("请输入：");
                    str=scanner.next();
                    if(str.matches("[//w&&[_]]{1,}[@][//w&&[_]]{1,}[.][c][o][m]")){
                        System.out.println("匹配成功！");
                    }else{
                        System.out.println("匹配失败！");
                    }
                    break ;
                case "i":
                    break th;
                default:
                    System.out.println("缩入错误。");
                    break;
            }
        }

    }
}
//
//[\\w]{4,16}
//
//[\\d]{}[x[X]]
//
//[1-9]\d{5}(18|19|20)\d{2}(0[1-9]|1[0-2])(0[1-9]|\d|3)\d{3}[\dXx]$)|(^[1-9]\d{5}\d{2}(0[1-9]|1[0-2])(0[1-9]|\d|3)\d{3}