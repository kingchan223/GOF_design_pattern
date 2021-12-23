package com.example.designPattern.chainOfResponsibility.in_java;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello")// "/hello" 요청이 오면 해당 필터를 거친다.
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("환영합니다.");
        chain.doFilter(request, response);
        System.out.println("안녕히가세요");
    }
}
