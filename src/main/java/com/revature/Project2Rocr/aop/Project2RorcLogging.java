package com.revature.Project2Rocr.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Project2RorcLogging {

private Logger logger = Logger.getLogger(this.getClass());
    
    
    @After("execution( * com.revature.Project2Rocr.service.*.*(..))")
    public void logExecutionTime(JoinPoint joinPoint) throws Throwable {
        System.out.println("Current Directory = " + System.getProperty("user.dir"));
        System.out.println("LOGGING");
        logger.info("Using a service");
        logger.error("This is an error!");
        logger.debug("Debugging...");
    }
}
