package com.example.liboah.greendaodemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liboah on 2017/9/29.
 */

public class ProxyHandler implements InvocationHandler{

    private RealSubject proxied;

    public ProxyHandler( RealSubject proxied ) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(1);
        Object f = method.invoke(proxied, args);
        System.out.println(2);
        return f;
    }
}
