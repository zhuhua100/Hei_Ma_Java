package com.zhuhua100.string_code.test8;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project 调整字符串
 */
public class Test8 {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        String str0="mnopqrstuvwxyzabcdefghijkl";
        for (int i = 0; i < str.length(); i++){
            str0=str0.substring(1)+str0.substring(0,1);
            System.out.println(str0);
            if(str.equals(str0)){
                System.out.println("成功匹配！");
                return;
            }
        }
        System.out.println("匹配失败！");
    }
}
