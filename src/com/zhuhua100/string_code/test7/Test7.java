package com.zhuhua100.string_code.test7;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project 阿拉伯数字转罗马数字
 */
public class Test7 {
//    public static void main(String[] args) {
//        System.out.println("请输入0-9的阿拉伯数字");
//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//        if(number<0||number>9){
//            System.out.println("输入错误！");
//        }
//        switch (number){
//            case 0:
//                System.out.println("");
//                break;
//            case 1:
//                System.out.println("I");
//                break;
//            case 2:
//                System.out.println("II");
//                break;
//            case 3:
//                System.out.println("III");
//                break;
//            case 4:
//                System.out.println("IV");
//                break;
//            case 5:
//                System.out.println("V");
//                break;
//            case 6:
//                System.out.println("VI");
//                break;
//            case 7:
//                System.out.println("VII");
//                break;
//            case 8:
//                System.out.println("VIII");
//            case 9:
//                System.out.println("IX");
//        }
//     }
    public static void main(String[] args) {
        System.out.println("请输入一个至多九位数的阿拉伯数字：");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        if(str.length()>9){
            System.out.println("输入错误！");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                System.out.println("输入错误");
                return;
            }
        }
        showRoman(str);
    }
    public static void showRoman(String str){
        String str1=lon(str);
        String str2=mid(str);
        String str3=sht(str);
        lonShow(str1);
        midShow(str2);
        shtShow(str3);
    }

    public static String lon(String str){
        String str1="";
        switch (str.length()){
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                return str1;
            case 7:
                str1=str.substring(0,1);
                return str1;
            case 8:
                str1=str.substring(0,2);
                return str1;
            case 9:
                str1=str.substring(0,3);
                return str1;
            default:
                return str1;
        }
    }

    public static String mid(String str){
        String str1="";
        switch (str.length()){
            case 3:
            case 2:
            case 1:
            case 0:
                return str1;
            case 4:
                str1=str.substring(0,1);
                return str1;
            case 5:
                str1=str.substring(0,2);
                return str1;
            case 6:
                str1=str.substring(0,3);
                return str1;
            case 7:
                str1=str.substring(1,4);
                return str1;
            case 8:
                str1=str.substring(2,5);
                return str1;
            case 9:
                str1=str.substring(3,6);
                return str1;
            default:
                return str1;
        }
    }

    public static String sht(String str){
        String str1="";
        switch (str.length()){
            case 0:
                return str1;
            case 1:
                str1=str.substring(0,1);
                return str1;
            case 2:
                str1=str.substring(0,2);
                return str1;
            case 3:
                str1=str.substring(0,3);
                return str1;
            case 4:
                str1=str.substring(1,4);
                return str1;
            case 5:
                str1=str.substring(2,5);
                return str1;
            case 6:
                str1=str.substring(3,6);
                return str1;
            case 7:
                str1=str.substring(4,7);
                return str1;
            case 8:
                str1=str.substring(5,8);
                return str1;
            case 9:
                str1=str.substring(6,9);
                return str1;
            default:
                return str1;
        }
    }

    public static void lonShow(String str){
        switch(str.length()){
            case 0:
                break;
            case 1:
                System.out.print(glon(str));
                break;
            case 2:
                System.out.print(slon(str));
                break;
            case 3:
                System.out.print(blon(str));
                break;
            default:
                break;
        }
    }

    public static void midShow(String str){
        switch(str.length()){
            case 0:
                break;
            case 1:
                System.out.print(gmid(str));
                break;
            case 2:
                System.out.print(smid(str));
                break;
            case 3:
                System.out.print(bmid(str));
                break;
            default:
                break;
        }
    }

    public static void shtShow(String str){
        switch(str.length()){
            case 0:
                break;
            case 1:
                System.out.println(gsht(str));
                break;
            case 2:
                System.out.println(ssht(str));
                break;
            case 3:
                System.out.println(bsht(str));
                break;
            default:
                break;
        }
    }
    public static String gsht(String str){
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return ones[Integer.parseInt(str)];
    }

    public static String ssht(String str){
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return tens[Integer.parseInt(str.substring(0,1))]+gsht(str.substring(1));
    }

    public static String bsht(String str){
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        return hundreds[Integer.parseInt(str.substring(0,1))]+ssht(str.substring(1));
    }

    public static String gmid(String str){
        String[] thousands = {"", "M", "MM", "MMM", "MV̅", "V̅", "V̅M", "V̅MM", "V̅MMM", "MX̅"};
        return thousands[Integer.parseInt(str)];
    }

    public static String smid(String str){
        String[] tenThousands = {"", "X̅", "X̅X̅", "X̅X̅X̅", "X̅L̅", "L̅", "L̅X̅", "L̅X̅X̅", "L̅X̅X̅X̅", "X̅C̅"};
        return tenThousands[Integer.parseInt(str.substring(0,1))]+gmid(str.substring(1));
    }

    public static String bmid(String str){
        String[] hundredThousands = {"", "C̅", "C̅C̅", "C̅C̅C̅", "C̅D̅", "D̅", "D̅C̅", "D̅C̅C̅", "D̅C̅C̅C̅", "C̅M̅"};
        return hundredThousands[Integer.parseInt(str.substring(0,1))]+smid(str.substring(1));
    }

    public static String glon(String str){
        String[] millions = {"", "M̅", "M̅M̅", "M̅MM̅", "M̅V̿", "V̿", "V̿M", "V̿M̅M̅", "V̿M̅M̅M̅", "M̅X̿"};
        return millions[Integer.parseInt(str)];
    }

    public static String slon(String str){
        String[] tenMillions = {"", "X̿", "X̿X̿", "X̿X̿X̿", "X̿L̿", "L̿", "L̿X̿", "L̿X̿X̿", "L̿X̿X̿X̿", "X̿C̿"};
        return tenMillions[Integer.parseInt(str.substring(0,1))]+glon(str.substring(1));
    }

    public static String blon(String str){
        String[] hundredMillions = {"", "C̿", "C̿C̿", "C̿C̿C̿", "C̿D̿", "D̿", "D̿C̿", "D̿C̿C̿", "D̿C̿C̿C̿", "C̿M̿"};
        return hundredMillions[Integer.parseInt(str.substring(0,1))]+slon(str.substring(1));
    }
}
