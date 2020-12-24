package com.iverson.proxy.staticproxy;

import com.iverson.proxy.Person;

/**
 * Created by Iverson on 2020-12-25
 */
public class Father implements Person {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("双方父母同意,确立关系");
    }
}
