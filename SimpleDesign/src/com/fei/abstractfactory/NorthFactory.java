package com.fei.abstractfactory;

public class NorthFactory implements FuritFactory {
    @Override
    public Furit getApple() {
        return new NorthaApple();
    }

    @Override
    public Furit getBanana() {
        return new NorthBanana();
    }
}
