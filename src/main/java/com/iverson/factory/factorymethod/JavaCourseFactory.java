package com.iverson.factory.factorymethod;

import com.iverson.factory.ICourse;
import com.iverson.factory.JavaCourse;

/**
 * Create by Iverson 2020-12-20 22:25
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
