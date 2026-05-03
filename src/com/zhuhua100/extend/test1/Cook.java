package com.zhuhua100.extend.test1;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Cook extends Manager{
    public Cook() {
    }

    public Cook(String id, String name, int wage, int manmoney) {
        super(id, name, wage, manmoney);
    }

    public void work(){
        System.out.println("炒菜");
    }
}
