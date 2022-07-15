package com.java.design.chain.filter;

import com.java.design.chain.filter.model.Request;
import com.java.design.chain.filter.model.Response;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class Main {

    public static void main(String[] args) {
        String msg = "request : ,,，，世界末日来了";
        Request request = new Request();
        Response response = new Response();
        response.setResponse("response: ");
        request.setRequest(msg);
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new CharFilter())
                .addFilter(new SensitiveFilter())
                .addFilter(new CharFilter());
        filterChain.doFilter(request,response,filterChain);
        System.out.println(request.getRequest());
        System.out.println(response.getResponse());
    }
}
