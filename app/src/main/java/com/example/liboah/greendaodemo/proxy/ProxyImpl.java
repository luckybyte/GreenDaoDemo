package com.example.liboah.greendaodemo.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by liboah on 2017/9/29.
 */

public class ProxyImpl implements Subject {

    private ProxyHandler handlerl;

    public ProxyImpl(ProxyHandler invocationHandler) {
        this.handlerl = invocationHandler;
    }

    @Override
    public Object doSomething() {
        try {
            Object[] ar = {};
            return handlerl.invoke(this, Subject.class.getMethod("doSomething"), ar);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
