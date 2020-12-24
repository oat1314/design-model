package com.iverson.singleton.hungry;

/**
 * Create by Iverson 2020-12-20 22:46
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
