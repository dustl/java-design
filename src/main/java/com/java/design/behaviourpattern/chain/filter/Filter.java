package com.java.design.behaviourpattern.chain.filter;

import com.java.design.behaviourpattern.chain.filter.model.Request;
import com.java.design.behaviourpattern.chain.filter.model.Response;

/**
 * @author liwy
 * @date 2022/7/14
 */
public interface Filter {

    /**
     * 过滤器处理
     * @param request 请求
     * @param response 响应
     * @param filterChain 过滤链
     * */
    void doFilter(Request request, Response response,FilterChain filterChain);
}
