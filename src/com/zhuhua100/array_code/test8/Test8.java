package com.zhuhua100.array_code.test8;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test8 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student(2024311001,"Bob",20);
        students[1]=new Student(2024311002,"Amy",20);
        students[2]=new Student(2024311003,"Kate",20);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请添加一个学生对象。");
        System.out.println("请输入学生学号：");
        int id= scanner.nextInt();
        System.out.println("请输入学生姓名：");
        String name= scanner.next();
        System.out.println("请输入学生年龄：");
        int age= scanner.nextInt();
        Student newstu=new Student(id,name,age);
        boolean j=true;
        for (int i = 0; i < 3; i++) {
            if(students[i].getId()==newstu.getId()){
                System.out.println("对不起，你输入的学生信息中学号信息与系统冲突，无法保存。");
                j=false;
            }
        }
        System.out.println("---------------------------");
        System.out.println("下面开始遍历系统中学生信息。");
        if(j){
            Student[] students0=new Student[3+1];
            students0[0]=students[0];
            students0[1]=students[1];
            students0[2]=students[2];
            students0[3]=newstu;
            for (int i = 0; i < 4; i++) {
                System.out.println(students0[i]);
            }
            System.out.println("---------------------------");
            System.out.println("请输入你要删除的学生学号");
            int del= scanner.nextInt();
            boolean k=true;
            for (int i = 0; i < 4; i++) {
                if(students0[i].getId()==del){
                    students0[i]=null;
                    k=false;
                    System.out.println("删除成功！");
                }
            }
            if(k){
                System.out.println("删除失败！");
            }
            for (int i = 0; i < 4; i++) {
                if(students0[i]==null)continue;
                System.out.println(students0[i]);
                if(students0[i].getId()==2024311005)
                    students0[i].setId(students0[i].getId()+1);
            }
            System.out.println("---------------------------");
            for (int i = 0; i < 4; i++) {
                if(students0[i]==null)continue;
                System.out.println(students0[i]);
            }
        }else{
            for (int i = 0; i < 3; i++) {
                System.out.println(students[i]);
            }
            System.out.println("---------------------------");
            System.out.println("请输入你要删除的学生学号");
            int del= scanner.nextInt();
            boolean k=true;
            for (int i = 0; i < 3; i++) {
                if(students[i].getId()==del){
                    students[i]=null;
                    k=false;
                    System.out.println("删除成功！");
                }
            }
            if(k){
                System.out.println("删除失败！");
            }
            for (int i = 0; i < 3; i++) {
                if(students[i]==null)continue;
                System.out.println(students[i]);
                if(students[i].getId()==2024311005)
                    students[i].setId(students[i].getId()+1);
            }
            System.out.println("---------------------------");
            for (int i = 0; i < 3; i++) {
                if(students[i]==null)continue;
                System.out.println(students[i]);
            }
        }

    }
}
