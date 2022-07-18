package com.java.design.creationalpattern.prototype;

import java.io.*;
import java.math.BigDecimal;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */

public class Book implements Cloneable,Serializable {



    private String name;

    private Author author;

    private BigDecimal price;
    // 浅拷贝，但是对象不同了，只是属性相同
    // 如果引用了对象，那么浅拷贝只是引用其对象，不会再次拷贝后重新赋值，改变该属性后会影响原本对象
    @Override
    protected Book clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return (Book) clone;
    }

    // 2 以流的方式深拷贝，对象内部属性引用也不一样了
    public Book deepClone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream os = new ObjectOutputStream(bos);
            os.writeObject(this);
            ByteArrayInputStream is = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(is);
            Book o = (Book) ois.readObject();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
