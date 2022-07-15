package com.java.design.chain.demo1;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class Main {

    public static void main(String[] args) {
        // 1责任链可以对一个请求，处理其中的一半后移交给下面的处理器。2严格的责任链是负全责，一个处理器就处理完成这个请求
        // 责任链更像于if的替换，这种有利于解耦长的工作流，即顺序调整，以及新增减少工作流的某个部分，不对其他处理器造成影响
        // 单一职责：每个处理器处理负责的部分，这样的处理无疑是对庞大的工作流有好处的，而不是一个工作流的全部活都给一个类或者一个方法干完。
        AbstractHandler first = new FirstHandler();
        AbstractHandler second = new SecondHandler();
        AbstractHandler third = new ThirdHandler();
        first.setNextHandler(second);
        second.setNextHandler(third);
        first.handle("B");

    }
}
