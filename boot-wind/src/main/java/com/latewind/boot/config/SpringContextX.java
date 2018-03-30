package com.latewind.boot.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Configuration  
public class SpringContextX implements ApplicationContextAware {  
  
    private static ApplicationContext applicationContext;  
  
    @Override  
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  
    	SpringContextX.applicationContext = applicationContext;  
    }  
  
    public static ApplicationContext getCtx() {  
        return SpringContextX.applicationContext;  
    }  
  
    public static <T> T getBean(Class<T> t) {  
        return SpringContextX.applicationContext.getBean(t);  
    }  
  
} 