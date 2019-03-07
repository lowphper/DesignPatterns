package com.fei.abstractfactory;

public class SouthFactory implements FuritFactory {
    @Override
    public Furit getApple() {
        return new SouthApple();
    }

    @Override
    public Furit getBanana() {
        return new SouthBanana();
    }
}
