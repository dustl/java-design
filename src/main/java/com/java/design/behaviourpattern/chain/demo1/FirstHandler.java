package com.java.design.behaviourpattern.chain.demo1;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class FirstHandler extends AbstractHandler{
    @Override
    protected void handle(String condition) {
        if ("A".equals(condition)) {
            System.out.println("处理A业务..");
        }else {
            // 如果不是该处理器处理的，提交给下一个
            AbstractHandler nextHandler = getNextHandler();
            if (nextHandler != null) {
                nextHandler.handle(condition);
            }
        }
    }
}
