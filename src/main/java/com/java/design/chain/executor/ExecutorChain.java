package com.java.design.chain.executor;

/**
 * @author liwy
 * @date 2022/7/14
 */
public interface ExecutorChain {

    /**
     * 添加处理器
     * @param executor 添加处理器
     * @return 处理链
     * */
    ExecutorChain addExecutor(Executor executor);
    /**
     * 执行任务
     * */
    void run();
}
