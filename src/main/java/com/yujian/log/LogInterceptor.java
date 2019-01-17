package com.yujian.log;

//这个类就是切面

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {

    //@Pointcut
    //Advice(通知)
    @Before("execution(* com.yujian.service.*.* (..))")
    public void befor(){
        System.out.println("执行业务方法之前的日志");
    }

    @After("execution(* com.yujian.service.*.* (..))")
    public void after(){
        System.out.println("执行业务操作之后的日志");
    }
}
