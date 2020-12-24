package com.iverson.factory.factorymethod;

import com.iverson.factory.ICourse;
import com.iverson.factory.JavaCourse;
import com.iverson.factory.PythonCourse;

/**
 * Create by Iverson 2020-12-20 22:25
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
