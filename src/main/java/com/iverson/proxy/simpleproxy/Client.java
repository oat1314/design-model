package com.iverson.proxy.simpleproxy;

/**
 * Created by Iverson on 2020-12-25
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
