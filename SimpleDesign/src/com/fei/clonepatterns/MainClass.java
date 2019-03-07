package com.fei.clonepatterns;

import com.fei.clonepatterns.Person;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("陈");
        p1.setAge(18);
        //System.out.println(p1);//name='陈', age=18
        //-----------引用
        //Person p2 = p1;
       //System.out.println(p2);//name='陈', age=18
        //-----------
//        p2.setName("晨");
//        System.out.println(p1);//name='晨', age=18
//        System.out.println(p2);//name='晨', age=18
        //----------克隆
//        Person p3 = p1.clone();
//        System.out.println(p3);//name='陈', age=18
//        p1.setName("晨");
//        System.out.println(p3);//name='陈', age=18,拷贝是新建一个一模一样的对象，不是引用，对象互不影响
        //-----------浅拷贝
        ArrayList<String> friends = new ArrayList<>();
        friends.add("二狗");
        p1.setFriends(friends);
        Person p3 = p1.clone();
        System.out.println(p1);//name='陈', age=18, friends=[二狗]
        System.out.println(p3);//name='陈', age=18, friends=[二狗]
        friends.add("刘");
        System.out.println(p1);//name='陈', age=18, friends=[二狗, 刘]
        System.out.println(p3);//name='陈', age=18, friends=[二狗, 刘],变了？这就是浅拷贝，引用属性并没有独立拷贝，用的都是一份
        //----------深度拷贝
        //p1:Person{name='陈', age=18, friends=[二狗, 刘]}
        //p2:Person{name='陈', age=18, friends=[二狗]}

    }
}
