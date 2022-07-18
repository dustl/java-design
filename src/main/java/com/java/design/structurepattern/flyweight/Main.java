package com.java.design.structurepattern.flyweight;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 * 享元：顾名思义共享单元，特点是全局共享该对象， 前提是对象不可变。节省内存。
 */
public class Main {

    public static void main(String[] args) {
        // integerCache 会缓存 -128 - 127 的数.系统常用，不大的数
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 129;
        Integer i4 = 129;
        // true
        System.out.println(i1 == i2);

        // false
        System.out.println(i3 == i4);

        String s = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        // true
        System.out.println(s == s2);
        // false
        System.out.println(s == s3);

    }
}
