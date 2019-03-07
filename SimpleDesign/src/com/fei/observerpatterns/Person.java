package com.fei.observerpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Person extends Observable{
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
        this.setChanged();//告诉观察者改变了
        this.notifyObservers(name);//可以有参数
    }
    public void setAge(int age) {
        this.age = age;
        this.setChanged();//告诉观察者改变了
        this.notifyObservers(age);//可以有参数
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age ;
    }
}
