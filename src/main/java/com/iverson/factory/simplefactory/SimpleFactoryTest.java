package com.iverson.factory.simplefactory;

import com.iverson.factory.ICourse;
import com.iverson.factory.JavaCourse;

/**
 * Create by Iverson 2020-12-20 22:03
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }
}
