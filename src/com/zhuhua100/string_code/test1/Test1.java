package com.zhuhua100.string_code.test1;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test1 {
    public static void main(String[] args) {
        String rightUserName="2024311003";
        String rightUserPassword="Jyy456!";
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名（全数字）：");
            String UserName= scanner.next();
            System.out.println("请输入密码（必须包含大小写字母，数字，特殊字符）：");
            String UserPassword= scanner.next();
            if(rightUserName.equals(UserName)&&rightUserPassword.equals(UserPassword)){
                System.out.println("验证成功！");
                return;
            } else if (!rightUserName.equals(UserName)&&rightUserPassword.equals(UserPassword)) {
                System.out.println("用户名错误！");
            }else if (rightUserName.equals(UserName)&&!rightUserPassword.equals(UserPassword)){
                System.out.println("密码错误！");
            }else {
                System.out.println("用户名和密码都错误！");
            }
        }
        System.out.println("很抱歉，你的三次登陆机会已用完，系统已锁定。");
    }
}
