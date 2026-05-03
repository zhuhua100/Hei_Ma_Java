package com.zhuhua100.array_code.test5;

import java.util.Scanner;

/**
 * @author jyf31
 * @date 2026/5/1
 * @project Hei_Ma_Java
 */
public class Test5 {
    public static void main(String[] args) {
        Goods[] buy=new Goods[3];
        Scanner scanner=new Scanner(System.in);
        System.out.println("-------------------------");
        for (int i = 0; i < 3; i++) {
            buy[i]=new Goods();
            System.out.println("请输入第"+(i+1)+"件商品的id：");
            buy[i].setId(scanner.next());
            System.out.println("请输入第"+(i+1)+"件商品的名字：");
            buy[i].setName(scanner.next());
            System.out.println("请输入第"+(i+1)+"件商品的价格：");
            buy[i].setPrice(scanner.nextDouble());
            System.out.println("请输入第"+(i+1)+"件商品的库存：");
            buy[i].setStore(scanner.nextInt());
            System.out.println("-------------------------");
        }
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-");
        for (int i = 0; i < 3; i++) {
            System.out.println("第"+(i+1)+"件商品的id为：" +buy[i].getId()+
                                                "名字为:"+buy[i].getName()+
                                                "价格为："+buy[i].getPrice()+
                                                "库存为："+buy[i].getStore());
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-");
        }
    }
}
