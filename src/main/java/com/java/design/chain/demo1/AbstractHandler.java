package com.java.design.chain.demo1;

/**
 * @author liwy
 * @date 2022/7/14
 * 抽象处理者，定义下一个处理器，以及抽象处理方法，把请求以及处理解耦
 */
public abstract class AbstractHandler {
    /**
     * 下一个处理器
     * */
    private AbstractHandler nextHandler;

    /**
     * 处理请求
     *
     * @param condition 条件参数
     */
    protected abstract void handle(String condition);


    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
