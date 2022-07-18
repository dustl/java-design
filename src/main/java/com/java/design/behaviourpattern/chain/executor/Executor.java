package com.java.design.behaviourpattern.chain.executor;

/**
 * @author liwy
 * @date 2022/7/14
 */
@FunctionalInterface
public interface Executor {

    /**
     * 执行方法
     * @param executorChain 处理链
     * */
    void run(ExecutorChain executorChain);
}
