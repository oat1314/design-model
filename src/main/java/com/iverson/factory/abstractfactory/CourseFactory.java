package com.iverson.factory.abstractfactory;

/**
 * Create by Iverson 2020-12-20 22:36
 */
public interface CourseFactory {
    INote createNote();

    IVedio createVideo();
}
