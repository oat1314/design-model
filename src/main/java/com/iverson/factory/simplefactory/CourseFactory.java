package com.iverson.factory.simplefactory;

import com.iverson.factory.ICourse;

/**
 * Create by Iverson 2020-12-20 22:01
 */
public class CourseFactory {
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
