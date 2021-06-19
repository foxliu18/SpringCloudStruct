package com.designmode.AOP.pointCut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnotationPointcut {

    @Pointcut("execution(* com.designmode.AOP.mode.UserServiceImpl.*(..))")
    private void anyMethod(){}//定义一个切入点

    @Before("anyMethod()")
    public void before(){
        System.out.println("----------Before method execution-----------");
    }

    @After("anyMethod()")
    public void after(){
        System.out.println("----------After method execution-----------");
    }

    @Around("anyMethod()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Vor Around");
        System.out.println("Sign:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("Nach Around");
        System.out.println(proceed);
    }
}
