package com.zhuhua100.string_code.test10;

import java.util.Random;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project 生成五位验证码，四位为大小写字母，一位为数字
 */
public class Test10 {
    public static void main(String[] args) {
        char[] chars=new char[5];
        Random random=new Random();
        chars[random.nextInt(0,5)]=(char)(random.nextInt(0,10)+'0');
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='\u0000'){
                if (random.nextBoolean()) {
                    chars[i]=(char)(random.nextInt(0,26)+'a');
                } else {
                    chars[i]=(char)(random.nextInt(0,26)+'A');
                }
            }
        }
        System.out.println("生成的验证码为："+String.valueOf(chars));
    }
}
