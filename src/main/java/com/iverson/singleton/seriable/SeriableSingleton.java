package com.iverson.singleton.seriable;

import java.io.Serializable;

/**
 * Create by Iverson 2020-12-21 21:32
 */
public class SeriableSingleton implements Serializable {
    public final static SeriableSingleton INSTANCE  = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
