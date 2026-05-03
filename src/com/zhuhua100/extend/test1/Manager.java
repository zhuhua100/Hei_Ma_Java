package com.zhuhua100.extend.test1;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Manager extends Employee{
    private int manmoney;

    public Manager() {
    }

    public Manager(String id, String name, int wage, int manmoney) {
        super(id, name, wage);
        this.manmoney = manmoney;
    }

    public int getManmoney() {
        return manmoney;
    }

    public void setManmoney(int manmoney) {
        this.manmoney = manmoney;
    }

    public void work(){
        System.out.println("管理其他人");
    }
}
