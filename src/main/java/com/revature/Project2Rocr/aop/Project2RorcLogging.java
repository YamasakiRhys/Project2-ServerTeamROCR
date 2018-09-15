package com.revature.Project2Rocr.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Project2RorcLogging {

private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    @After("execution( * com.revature.Project2Rocr.service.*.*(..))")
    public void logExecutionTime(JoinPoint joinPoint) throws Throwable {
        System.out.println("Current Directory = " + System.getProperty("user.dir"));
        System.out.println("LOGGING");
        logger.info("Using a service");
        logger.info("Allowed execution for {}", joinPoint);
        logger.error("This is an error!");
    }
}
