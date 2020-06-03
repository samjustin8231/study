package com.example.designpattern.behavior.responsibility.filter;

import java.io.IOException;

/**
 * @author sunyajun
 * @date 2020/4/14 5:16 PM
 */
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 在创建Filter时自动调用，
        // 其中filterConfig包含这个Filter的配置参数，比如name之类的（从配置文件中读取的）
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("拦截客户端发送来的请求.");
        chain.doFilter(request, response);
        System.out.println("拦截发送给客户端的响应.");
    }

    @Override
    public void destroy() {

    }
}
