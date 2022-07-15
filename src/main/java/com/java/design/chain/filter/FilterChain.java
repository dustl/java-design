package com.java.design.chain.filter;

import com.java.design.chain.filter.model.Request;
import com.java.design.chain.filter.model.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class FilterChain implements Filter{
    private List<Filter> filterList = new ArrayList<>();
    /**
     * 标记执行到哪个filter
     * */
    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        // 返回本对象，方便doFilter操作
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filterList.size()) {
            index=0;
            return;
        }
        Filter filter = filterList.get(index++);
        filter.doFilter(request,response,filterChain);

    }
}
