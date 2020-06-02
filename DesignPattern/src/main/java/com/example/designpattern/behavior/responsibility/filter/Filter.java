package com.example.designpattern.behavior.responsibility.filter;

import java.io.IOException;

/**
 * @author sunyajun
 * @date 2020/4/14 5:15 PM
 */
public interface Filter {

    void init(FilterConfig filterConfig) throws ServletException;

    void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException;

    void destroy();
}
