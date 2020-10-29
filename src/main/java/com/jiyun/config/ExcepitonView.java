package com.jiyun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class ExcepitonView implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView view = new ModelAndView();
        if(e instanceof  NullPointerException){
            view.addObject("msg",e);
            view.setViewName("error");
        }
        if(e instanceof  ArithmeticException){
            view.addObject("msg",e);
            view.setViewName("error");
        }
        return view;
    }
}
