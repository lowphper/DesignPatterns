package com.fei.abstractfactory;

/**
 * 工厂方法，只定义生成水果的方法
 */
public interface FuritFactory {
    //生产苹果的
    Furit getApple();
    //生产香蕉的
    Furit getBanana();
}
