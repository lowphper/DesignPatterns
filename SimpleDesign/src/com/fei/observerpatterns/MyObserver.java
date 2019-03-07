package com.fei.observerpatterns;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者对象发发生变化"+o+"参数："+arg);
    }
}
