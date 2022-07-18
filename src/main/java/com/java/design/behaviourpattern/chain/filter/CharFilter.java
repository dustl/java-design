package com.java.design.behaviourpattern.chain.filter;

import com.java.design.behaviourpattern.chain.filter.model.Request;
import com.java.design.behaviourpattern.chain.filter.model.Response;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class CharFilter implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        request.setRequest(request.getRequest().replace(",", "").replace("，", ""));
        filterChain.doFilter(request,response,filterChain);
        response.setResponse(response.getResponse()+" charFilter ");

    }
}
