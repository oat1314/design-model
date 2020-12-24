package com.iverson.factory.abstractfactory;

/**
 * Create by Iverson 2020-12-20 22:39
 */
public class PythonCourseFactory implements CourseFactory{

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVedio createVideo() {
        return new PythonVideo();
    }
}
