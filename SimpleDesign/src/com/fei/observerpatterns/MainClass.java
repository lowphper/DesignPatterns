package com.fei.observerpatterns;

/**
 * 实际上Observable就相当于一个容器，把那些观察者放在容器里，当发生改变时
 * 把他们拿出来，调用update方法，在Observable中，notifyObservers方法中
 * for (int i = arrLocal.length-1; i>=0; i--)
 *   ((Observer)arrLocal[i]).update(this, arg);
 }
 实锤了，就是容器
 实例：
 博客发布文章，所有订阅的都可以收到新文章信息，当发布文章后，调用 this.notifyObservers(name);就可以了
 */
public class MainClass {
    public static void main(String[] args) {

        Person person = new Person();
        person.addObserver(new MyObserver());
        person.setAge(20);//Person{name='null', age=20参数：20
    }
}
