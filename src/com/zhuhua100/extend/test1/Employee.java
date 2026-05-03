package com.zhuhua100.extend.test1;

/**
 * @author jyf31
 * @date 2026/5/3
 * @project Hei_Ma_Java
 */
public class Employee {
    private String id;
    private String name;
    private int wage;

    public Employee() {
    }

    public Employee(String id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void work(){
        System.out.println("员工在工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }
}
