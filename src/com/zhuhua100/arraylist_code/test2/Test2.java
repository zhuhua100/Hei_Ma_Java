package com.zhuhua100.arraylist_code.test2;

import java.util.ArrayList;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project Hei_Ma_Java
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student("张三",20));
        list.add(new Student("李四",20));
        list.add(new Student("王五",20));

        System.out.println(list);

        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            if(i!=list.size()-1){
                System.out.println(list.get(i).getName());
                System.out.println(list.get(i).getId()+",");
            }
            else{
                System.out.println(list.get(i).getName());
                System.out.println(list.get(i).getId()+",");            }
        }
        System.out.println("]");
    }
}

class Student{
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
