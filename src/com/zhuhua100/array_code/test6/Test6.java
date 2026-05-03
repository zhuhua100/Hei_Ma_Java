package com.zhuhua100.array_code.test6;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test6 {
    public static void main(String[] args) {
        Phone[] test=new Phone[3];
        test[0]=new Phone("OPPO",1000,"黑色");
        test[1]=new Phone("HuaWei",2000,"红色");
        test[2]=new Phone("iPhone",3000,"白色");
        System.out.println("三款手机的平均价格为："+avg(test));
    }
    private static double avg(Phone[] test){
        int len=test.length;
        double sum=0;
        for (Phone phone : test) {
            sum += phone.getPrice();
        }
        return sum/len;
    }
}
