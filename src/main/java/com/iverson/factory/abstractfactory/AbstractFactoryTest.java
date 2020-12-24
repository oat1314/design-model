package com.iverson.factory.abstractfactory;

/**
 * Create by Iverson 2020-12-20 22:36
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.createNote().edit();
        factory.createVideo().record();
    }
}
