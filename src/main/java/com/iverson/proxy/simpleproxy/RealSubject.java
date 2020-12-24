package com.iverson.proxy.simpleproxy;

/**
 * Created by Iverson on 2020-12-25
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real services is called.");
    }
}
