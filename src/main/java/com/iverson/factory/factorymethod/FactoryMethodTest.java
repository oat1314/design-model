package com.iverson.factory.factorymethod;

import com.iverson.factory.ICourse;

/**
 * Create by Iverson 2020-12-20 22:24
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new JavaCourseFactory();
        course = factory.create();
        course.record();
    }
}
