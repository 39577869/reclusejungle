package com.elcusejungle.config;

import com.elcusejungle.componet.HandlerIntercepter;
import com.elcusejungle.utils.DateConventer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 拦截器配置类
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override//放行静态资源
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**");
    }

    /*@Override//调用拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerIntercepter()).addPathPatterns("/**")//拦截所有请求
                .excludePathPatterns("/login");//排除请求
    }*/

    //配置试图解析器
    public WebMvcConfigurer webMvcConfigurerAdapter(){
        WebMvcConfigurer adapter = new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
                //registry.addViewController("/login.html").setViewName("login");
            }
        };
        return adapter;
    }

    // 配置转换器
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new DateConventer());
    }
}
