package com.zhuhua100.studentsystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/2
 * @project Hei_Ma_Java
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------欢迎来到学生管理系统-------------" +
                "\n1：添加学生" +
                "\n2：删除学生" +
                "\n3：修改学生" +
                "\n4：查询学生" +
                "\n5：退出" +
                "\n请输入您的选择：");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            String str = scanner.next();
            switch (str) {
                case "1":
                    addStudent(students);
                    break;
                case "2":
                    deleteStudent(students);
                    break;
                case "3":
                    modifyStudent(students);
                    break;
                case "4":
                    askStudent(students);
                    break;
                case "5":
                    System.out.println("退出。");
                    return;
                default:
                    System.out.println("没有这个选项。");
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Student stu=new Student();
        list.add(stu);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生信息。");
        System.out.println("请输入学生姓名：");
        stu.setName(scanner.next());
        System.out.println("请输入学生ID：");
        stu.setId(scanner.next());
        System.out.println("请输入学生年龄：");
        stu.setAge(scanner.nextInt());
        System.out.println("请输入学生住址：");
        stu.setAddress(scanner.next());
        return;
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入你要删除学生的任意信息（如名称，年龄，学号，住址，序号）\n你要输入哪类信息？");
        here:
        while (true){
            switch(new Scanner(System.in).next()){
                case "年龄":
                    System.out.println("请输入学生的年龄：");
                    int sc0=new Scanner(System.in).nextInt();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(list.get(i).getAge()==sc0){
                            list.remove(i);
                        }
                    }
                    break here;
                case "学号":
                    System.out.println("请输入学生的年龄：");
                    String str1=new Scanner(System.in).next();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(Objects.equals(list.get(i).getId(), str1)){
                            list.remove(i);
                        }
                    }
                    break here;
                case "住址":
                    System.out.println("请输入学生的住址：");
                    String str2=new Scanner(System.in).next();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(Objects.equals(list.get(i).getAddress(), str2)){
                            list.remove(i);
                        }
                    }
                    break here;
                case "序号":
                    System.out.println("请输入学生的序号：");
                    list.remove(new Scanner(System.in).nextInt());
                    break here;
                case "名称":
                    System.out.println("请输入学生的名称：");
                    String str3=new Scanner(System.in).next();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(Objects.equals(list.get(i).getName(), str3)){
                            list.remove(i);
                        }
                    }
                    break here;
                default:
                    System.out.println("输入类型错误。");
                    break;
            }
        }
        return;
    }

    public static void modifyStudent(ArrayList<Student> list) {
        System.out.println("请输入你要修改学生的任意信息（如名称，年龄，学号，住址，序号）\n你要输入哪类信息？");
        here:
        while (true){
            switch(new Scanner(System.in).next()){
                case "年龄":
                    System.out.println("请输入学生的年龄：");
                    int sc0=new Scanner(System.in).nextInt();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(list.get(i).getAge()==sc0){
                            modify(i, list);
                        }
                    }
                    break here;
                case "学号":
                    System.out.println("请输入学生的年龄：");
                    String str1=new Scanner(System.in).next();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(Objects.equals(list.get(i).getId(), str1)){
                            modify(i, list);
                        }
                    }
                    break here;
                case "住址":
                    System.out.println("请输入学生的住址：");
                    String str2=new Scanner(System.in).next();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(Objects.equals(list.get(i).getAddress(), str2)){
                            modify(i, list);
                        }
                    }
                    break here;
                case "序号":
                    System.out.println("请输入学生的序号：");
                    modify(new Scanner(System.in).nextInt(), list);
                    break here;
                case "名称":
                    System.out.println("请输入学生的名称：");
                    String str3=new Scanner(System.in).next();
                    for (int i = 0; i < list.toArray().length; i++) {
                        if(Objects.equals(list.get(i).getName(), str3)){
                            modify(i, list);
                        }
                    }
                    break here;
                default:
                    System.out.println("输入类型错误。");
                    break;
            }
        }
        return;
    }

    public static void askStudent(ArrayList<Student> list) {
        System.out.println("请输入你要查询的学生姓名：");
        String str0=new Scanner(System.in).next();
        Student stu=new Student();
        for (int i = 0; i < list.toArray().length; i++) {
            if(Objects.equals(list.get(i).getName(), str0)){
                stu=list.get(i);
            }
        }
        System.out.println("请输入你要查询学生的内容（如学号，年龄，住址）：");
        here:
        while (true){
            switch(new Scanner(System.in).next()){
                case "学号":
                    System.out.println("学生的学号是："+stu.getId());
                    break here;
                case "住址":
                    System.out.println("学生的住址是："+stu.getAddress());
                    break here;
                case "年龄":
                    System.out.println("学生的年龄是："+stu.getAge());
                    break here;
                default:
                    System.out.println("输入类型错误。");
                    break;
            }
        }
        return;
    }

    public static void modify(int j, ArrayList<Student> list){
        System.out.println("请输入你要修改的信息（如名称，年龄，学号，住址）\n你要输入哪类信息？");
        here:
        while (true){
            switch(new Scanner(System.in).next()){
                case "年龄":
                    System.out.println("请输入学生的年龄：");
                    int sc0=new Scanner(System.in).nextInt();
                    list.get(j).setAge(sc0);
                    break here;
                case "学号":
                    System.out.println("请输入学生的年龄：");
                    String str1=new Scanner(System.in).next();
                    list.get(j).setId(str1);
                    break here;
                case "住址":
                    System.out.println("请输入学生的住址：");
                    String str2=new Scanner(System.in).next();
                    list.get(j).setAddress(str2);
                    break here;
                case "名称":
                    System.out.println("请输入学生的名称：");
                    String str3=new Scanner(System.in).next();
                    list.get(j).setName(str3);
                    break here;
                default:
                    System.out.println("输入类型错误。");
                    break;
            }
        }
        return;
    }
}
