package com.iverson.proxy.staticproxy;

import com.iverson.proxy.Person;

/**
 * Created by Iverson on 2020-12-25
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求:肤白貌美大长腿");
    }
}
