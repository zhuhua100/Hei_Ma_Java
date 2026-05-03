package com.zhuhua100.array_code.test7;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test7 {
    public static void main(String[] args) {
        GirlFriend[] test=new GirlFriend[4];

        test[0]=new GirlFriend("杨贵妃",30,"女",new String[]{"LiZhi","KuaiLe"});
        test[1]=new GirlFriend("西施",20,"女",new String[]{"Money","KuaiLe"});
        test[2]=new GirlFriend("貂蝉",25,"女",new String[]{"YvWang","KuaiLe"});
        test[3]=new GirlFriend("王昭君",26,"女",new String[]{"Peace","KuaiLe"});
        int sum=0;
        for (int i = 0; i < test.length; i++) {
            sum+=test[i].getAge();
        }
        double avg=(double)sum/ test.length;
        System.out.println("四个女朋友的平均年龄为"+avg+"岁。");
        sum=0;
        for (int i = 0; i < test.length; i++) {
            if(test[i].getAge()<avg){
                sum+=1;
                System.out.println(test[i]);
            }
        }
        System.out.println("共有"+sum+"名女朋友的年龄低于平均值。");
    }
}
