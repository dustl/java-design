package com.java.design.creationalpattern.prototype;

import java.io.Serializable;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Author implements Serializable {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
