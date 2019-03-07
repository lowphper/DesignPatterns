package com.fei.abstractfactory;

/**
 * 组成：
 * 接口(抽象)工厂
 * 具体实现工厂
 * 抽象产品
 * 具体产品
 *
 * 使用抽象的接口创建 《一组》 相关产品
 * 一个具体工厂生产一组产品（南北方水果）
 * 更换具体工厂 就可以更换 一组产品
 *
 * 缺点：
 * 组合的方式
 * 新增一个产品家族成员（橘子），就要改抽象工厂和具体的实现类，扩展性差
 *
 *
 */
public class TestFurit {
    public static void main(String[] args) {
        FuritFactory f1 = new SouthFactory();
        //生产北方水果
        Furit southApple = f1.getApple();
        Furit southBanana = f1.getBanana();
        southApple.get();
        southBanana.get();
        System.out.println("--------------------------------------");
        //生产南方水果
        FuritFactory f2 = new NorthFactory();
        Furit northApple = f2.getApple();
        Furit northBanana = f2.getBanana();
        northApple.get();
        northBanana.get();


    }
}
