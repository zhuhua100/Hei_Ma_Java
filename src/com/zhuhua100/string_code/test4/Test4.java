package com.zhuhua100.string_code.test4;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project 数字转换为大写并带单位（例：123456为零佰壹拾贰万叁仟肆佰伍拾陆元）
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        sort(str);
    }

    public static void sort(String str){
        int num=str.length();
        if (num<=14) {
            zhao(str);
        }
        else{
            System.out.println("数值太大无法处理。");
        }
    }

    public static void qian(String str){
        int num=str.length();
        char[] c=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i]=str.charAt(i);
        }
        switch(num){
            case 0:
                System.out.println("零仟零佰零拾零元");
                break;
            case 1: ;
                char ge0=zhuanhua(c[0]);
                System.out.println("零仟零佰零拾"+ge0+"元");
                break;
            case 2:
                char shi0=zhuanhua(c[0]);
                char shi1=zhuanhua(c[1]);
                System.out.println("零仟零佰"+shi0+"拾"+shi1+"元");
                break;
            case 3:
                char bai0=zhuanhua(c[0]);
                char bai1=zhuanhua(c[1]);
                char bai2=zhuanhua(c[2]);
                System.out.println("零仟"+bai0+"佰"+bai1+"拾"+bai2+"元");
                break;
            case 4:
                char qian0=zhuanhua(c[0]);
                char qian1=zhuanhua(c[1]);
                char qian2=zhuanhua(c[2]);
                char qian3=zhuanhua(c[3]);
                System.out.println(qian0+"仟"+qian1+"佰"+qian2+"拾"+qian3+"元");
                break;
            default:
                break;
        }
    }

    public static void wan(String str){
        int num=str.length();
        String str0="";
        if (num>4){
            str0=str.substring(str.length() - 4);
            str=str.substring(0, str.length() - 4);  // ✅ 修复：用substring截取前半部分，避免replace替换所有匹配项
        }else{
            qian(str);
            return;
        }
        char[] c=new char[str.length()];  // ✅ 修复：数组大小应为当前str的实际长度
        for (int i = 0; i < str.length(); i++) {  // ✅ 修复：循环条件应为当前str的实际长度
            c[i]=str.charAt(i);
        }
        switch(str.length()){  // ✅ 修复：用当前段实际位数判断
            case 0:
                System.out.print("零仟零佰零拾零万");
                break;
            case 1: ;
                char ge0=zhuanhua(c[0]);
                System.out.print("零仟零佰零拾"+ge0+"万");
                break;
            case 2:
                char shi0=zhuanhua(c[0]);
                char shi1=zhuanhua(c[1]);
                System.out.print("零仟零佰"+shi0+"拾"+shi1+"万");
                break;
            case 3:
                char bai0=zhuanhua(c[0]);
                char bai1=zhuanhua(c[1]);
                char bai2=zhuanhua(c[2]);
                System.out.print("零仟"+bai0+"佰"+bai1+"拾"+bai2+"万");
                break;
            case 4:
                char qian0=zhuanhua(c[0]);
                char qian1=zhuanhua(c[1]);
                char qian2=zhuanhua(c[2]);
                char qian3=zhuanhua(c[3]);
                System.out.print(qian0+"仟"+qian1+"佰"+qian2+"拾"+qian3+"万");
                break;
            default:
                break;
        }
        if(num>4){
            qian(str0);
        }
    }

    public static void yi(String str){
        int num=str.length();
        String str0="";
        if (num>8){
            str0=str.substring(str.length() - 8);
            str=str.substring(0, str.length() - 8);  // ✅ 修复：用substring截取前半部分，避免replace替换所有匹配项
        }else{
            wan(str);
            return;
        }
        char[] c=new char[str.length()];  // ✅ 修复：数组大小应为当前str的实际长度
        for (int i = 0; i < str.length(); i++) {  // ✅ 修复：循环条件应为当前str的实际长度
            c[i]=str.charAt(i);
        }
        switch(str.length()){  // ✅ 修复：用当前段实际位数判断
            case 0:
                System.out.print("零仟零佰零拾零亿");
                break;
            case 1: ;
                char ge0=zhuanhua(c[0]);
                System.out.print("零仟零佰零拾"+ge0+"亿");
                break;
            case 2:
                char shi0=zhuanhua(c[0]);
                char shi1=zhuanhua(c[1]);
                System.out.print("零仟零佰"+shi0+"拾"+shi1+"亿");
                break;
            case 3:
                char bai0=zhuanhua(c[0]);
                char bai1=zhuanhua(c[1]);
                char bai2=zhuanhua(c[2]);
                System.out.print("零仟"+bai0+"佰"+bai1+"拾"+bai2+"亿");
                break;
            case 4:
                char qian0=zhuanhua(c[0]);
                char qian1=zhuanhua(c[1]);
                char qian2=zhuanhua(c[2]);
                char qian3=zhuanhua(c[3]);
                System.out.print(qian0+"仟"+qian1+"佰"+qian2+"拾"+qian3+"亿");
                break;
            default:
                break;
        }
        if(num>4){
            wan(str0);
        }
    }

    public static void zhao(String str){
        int num=str.length();
        String str0="";
        if (num>12){
            str0=str.substring(str.length() - 12);
            str=str.substring(0, str.length() - 12);  // ✅ 修复：用substring截取前半部分，避免replace替换所有匹配项
        }else{
            yi(str);
            return;
        }
        char[] c=new char[str.length()];  // ✅ 修复：数组大小应为当前str的实际长度
        for (int i = 0; i < str.length(); i++) {  // ✅ 修复：循环条件应为当前str的实际长度
            c[i]=str.charAt(i);
        }
        switch(str.length()){  // ✅ 修复：用当前段实际位数判断
            case 0:
                System.out.print("零仟零佰零拾零兆");
                break;
            case 1: ;
                char ge0=zhuanhua(c[0]);
                System.out.print("零仟零佰零拾"+ge0+"兆");
                break;
            case 2:
                char shi0=zhuanhua(c[0]);
                char shi1=zhuanhua(c[1]);
                System.out.print("零仟零佰"+shi0+"拾"+shi1+"兆");
                break;
            case 3:
                char bai0=zhuanhua(c[0]);
                char bai1=zhuanhua(c[1]);
                char bai2=zhuanhua(c[2]);
                System.out.print("零仟"+bai0+"佰"+bai1+"拾"+bai2+"兆");
                break;
            case 4:
                char qian0=zhuanhua(c[0]);
                char qian1=zhuanhua(c[1]);
                char qian2=zhuanhua(c[2]);
                char qian3=zhuanhua(c[3]);
                System.out.print(qian0+"仟"+qian1+"佰"+qian2+"拾"+qian3+"兆");
                break;
            default:
                break;
        }
        if(num>4){
            yi(str0);
        }
    }

    public static char zhuanhua(char c){
        switch (c){
            case '0':
                return '零';
            case '1':
                return '壹';
            case '2':
                return '贰';
            case '3':
                return '叁';
            case '4':
                return '肆';
            case '5':
                return '伍';
            case '6':
                return '陆';
            case '7':
                return '柒';
            case '8':
                return '捌';
            case '9':
                return '玖';
            default:
                break;
        }
        return '0';
    }
}
