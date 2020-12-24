package com.iverson.proxy.simpleproxy;

/**
 * Created by Iverson on 2020-12-25
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before() {
        System.out.println("called before request().");
    }

    public void  after() {
        System.out.println("called after request().");
    }

}
