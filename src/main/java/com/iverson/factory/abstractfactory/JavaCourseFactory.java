package com.iverson.factory.abstractfactory;

/**
 * Create by Iverson 2020-12-20 22:39
 */
public class JavaCourseFactory implements CourseFactory{

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVedio createVideo() {
        return new JavaVideo();
    }
}
