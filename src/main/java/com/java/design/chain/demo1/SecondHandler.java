package com.java.design.chain.demo1;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class SecondHandler extends AbstractHandler{
    @Override
    protected void handle(String condition) {
        if ("B".equals(condition)) {
            System.out.println("处理B业务...");
        }else {
            AbstractHandler nextHandler = getNextHandler();
            if (nextHandler != null) {
                nextHandler.handle(condition);
            }
        }
    }
}
