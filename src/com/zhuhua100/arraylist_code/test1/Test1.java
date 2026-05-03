package com.zhuhua100.arraylist_code.test1;

import java.util.ArrayList;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project Hei_Ma_Java
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("你好吗？");
        list.add("我的名字叫小帅。");
        list.add("很高兴认识你。");

        System.out.println(list);

//        list.clear();
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }
            else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
