package com.jiyun.lj;

import com.jiyun.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dllj implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        if(url.contains("dl")|| url.contains("todl") || url.contains("showname")){
            return true;
        }
        User user = (User) request.getSession().getAttribute("user");
        if(user!=null){
            return true;
        }
        response.sendRedirect("/stu/dl");
        return false;
    }
}
