package com.test.restapi.config.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectCommonJoinPointConfig {
    
    @Pointcut("execution(* com.test.restapi.services.*.*(..))")
    public void defaultServiceAOP(){};  
}
