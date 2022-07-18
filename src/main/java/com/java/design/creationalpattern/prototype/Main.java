package com.java.design.creationalpattern.prototype;

import java.math.BigDecimal;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setPrice(new BigDecimal(20));
        book.setName("围城");
        Author author = new Author();
        author.setName("钱钟书");
        book.setAuthor(author);
        System.out.println("source: " +book);
        Book book1 = book.deepClone();
        System.out.println(" deepClone book1 : " +(book.getAuthor() == book1.getAuthor()));
        System.out.println(" deepClone string : " +(book.getName() == book1.getName()));
        System.out.println("deepClone : "+ book1);
        try {
            // 浅拷贝，成员引用跟原对象相等
            Book clone = book.clone();
            System.out.println("clone author :" +(clone.getAuthor() == book.getAuthor()));
            System.out.println("clone name :" +(clone.getName() == book.getName()));
            System.out.println("clone :" +clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
