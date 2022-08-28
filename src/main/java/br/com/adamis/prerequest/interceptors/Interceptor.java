package br.com.adamis.prerequest.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	log.info(" ----------------- Requisição iniciada ----------------- ");
    	log.info("IP: "+request.getRemoteAddr());
        //log.info("Requisição interceptada: " + request.getHeader("Authorization"));
        return true;
    }

    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
    		ModelAndView modelAndView) throws Exception {    	
    	HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
    		throws Exception {
    	log.info(" ----------------- Requisição Finalizada ----------------- ");
    	HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}