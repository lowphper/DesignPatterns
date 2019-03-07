package com.fei.clonepatterns;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable{
    private String name;
    private int age;
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        new Object();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 重写Object clone方法
     * @return
     */
    @Override
    public Person clone(){
        try {
           // return (Person)super.clone();


            Person person = (Person) super.clone();
            List<String> newFriends = new ArrayList<>();
            for(String friend:this.getFriends()){
                newFriends.add(friend);
            }
            person.setFriends(newFriends);
            return person;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}
