package com.example.liboah.greendaodemo.proxy;

/**
 * Created by liboah on 2017/9/29.
 */

public class RealSubject implements Subject {
    @Override
    public Object doSomething() {
        System.out.println("do something");
        return "";
    }
}
