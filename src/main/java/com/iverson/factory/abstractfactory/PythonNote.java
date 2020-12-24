package com.iverson.factory.abstractfactory;

/**
 * Create by Iverson 2020-12-20 22:40
 */
public class PythonNote implements INote{
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
