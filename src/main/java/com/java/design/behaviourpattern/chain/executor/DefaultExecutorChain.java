package com.java.design.behaviourpattern.chain.executor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class DefaultExecutorChain implements ExecutorChain{
    List<Executor> executorList = new ArrayList<>();
    int index=0;

    @Override
    public ExecutorChain addExecutor(Executor executor) {
        executorList.add(executor);
        return this;
    }

    @Override
    public void run() {
        if (index == executorList.size()) {
            // 如果执行完了，那就重新开始，以应对下一次的调用处理器链
            index=0;
            return;
        }
        executorList.get(index++).run(this);
    }
}
