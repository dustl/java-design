package com.java.design.behaviourpattern.chain.executor;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class ExecutorDemo {

    public static void main(String[] args) {
        DefaultExecutorChain defaultExecutorChain = new DefaultExecutorChain();
        defaultExecutorChain.addExecutor(
                executorChain -> {
                    System.out.println("executor1");
                    // 调用下一个处理器
                    executorChain.run();
                }
        );
        defaultExecutorChain.addExecutor(executorChain -> {
            System.out.println("executor2");
            // 调用下一个处理器
            executorChain.run();
        });
        defaultExecutorChain.run();
        defaultExecutorChain.run();
        defaultExecutorChain.run();

    }

}
