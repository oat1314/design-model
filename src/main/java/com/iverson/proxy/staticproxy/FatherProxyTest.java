package com.iverson.proxy.staticproxy;

/**
 * Created by Iverson on 2020-12-25
 */
public class FatherProxyTest {
    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
