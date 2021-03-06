package org.zgl.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @作者： big
 * @创建时间： 2018/6/11
 * @文件描述：添加自定义拦截器
 */
@Configuration
public class Interceptor implements WebMvcConfigurer {
    @Autowired
    private HttpHandlerInterceptor handler;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.err.println("asdasd");
        registry.addInterceptor(handler).addPathPatterns("/");
    }
}
