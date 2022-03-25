package com.test.restapi.config.aop;


import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration; 

@Aspect
@Configuration
public class DefaultServiceInterceptor {
    
    private static final Logger logger = LogManager.getLogger(DefaultServiceInterceptor.class); 

    @Around("com.test.restapi.config.aop.AspectCommonJoinPointConfig.defaultServiceAOP()")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(String.format("-----------start default aspectj logging"));  

        String methodClassPath = joinPoint.getTarget().getClass().getName(); 

        logger.info(String.format("method name=%s", getMethodName(joinPoint)));  
        logger.info(String.format("method return type=%s", getMethodReturnType(joinPoint)));  
        logger.info(String.format("method class path=%s", methodClassPath));   
        
        joinPoint.proceed(); 

        logger.info(String.format("-----------end default aspectj logging"));   
    }

    public String getMethodName(ProceedingJoinPoint joinPoint){
        MethodSignature mthSignature = (MethodSignature)joinPoint.getSignature(); 
        Method method = mthSignature.getMethod();     
        return method.getName(); 
    } 

    public String getMethodReturnType(ProceedingJoinPoint joinPoint){
        MethodSignature mthSignature = (MethodSignature)joinPoint.getSignature(); 
        Method method = mthSignature.getMethod();  
        return method.getReturnType().getTypeName(); 
    }
}



