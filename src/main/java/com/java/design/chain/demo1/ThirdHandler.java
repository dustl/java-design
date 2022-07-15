package com.java.design.chain.demo1;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class ThirdHandler extends AbstractHandler{
    @Override
    protected void handle(String condition) {
        if ("C".equals(condition)) {
            System.out.println("处理C业务..");
        }else {
            AbstractHandler nextHandler = getNextHandler();
            if (nextHandler != null) {
                nextHandler.handle(condition);
            }
        }
    }
}
