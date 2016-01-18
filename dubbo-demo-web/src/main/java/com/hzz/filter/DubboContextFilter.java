package com.hzz.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.alibaba.dubbo.rpc.RpcContext;

public class DubboContextFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("set dubbo context caller to test.");
		RpcContext.getContext().setAttachment("caller", "test");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

}
