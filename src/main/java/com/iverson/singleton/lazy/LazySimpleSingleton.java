package com.iverson.singleton.lazy;

/**
 * Create by Iverson 2020-12-20 23:32
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {}

    private static LazySimpleSingleton lazy =null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
