package com.kf.chapter10.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 日志切面类
 */
@Aspect
public class LogAspect {
    /**
     日志切面类的方法需要动态感知到div()方法运行到哪里了, 然后再执行, 如果除法开始, 就日志开始方法,
     也叫通知方法, 分以下几种:
     前置通知: logStart(),在目标方法(div)运行之前运行 (@Before)
     后置通知:logEnd(), 在目标方法(div)运行结束之后运行,无论正常或异常结束 (@After)
     返回通知:logReturn, 在目标方法(div)正常返回之后运行 (@AfterReturning)
     异常通知:logException, 在目标方法(div)出现异常后运行(@AfterThrowing)
     环绕通知:以上没写,动态代理, 手动执行目标方法运行joinPoint.proceed(),最底层通知,手动指定执行目标方法(@Around),
     执行之前相当于前置通知, 执行之后相当于返回通知
     其实就是通过反射执行目标对象的连接点处的方法；
     */
    //抽取公共的切入点
    @Pointcut("execution(public int com.kf.chapter10.aop.Calculate.*(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void logStart(){
        System.out.println("方法运行开始......参数：{}");
    }

    @After("pointCut()")
    public void logEnd(){
        System.out.println("方法运行结束......参数：{}");
    }

    @AfterReturning("pointCut()")
    public void logReturn(){
        System.out.println("方法运行返回......参数：{}");
    }

    @AfterThrowing("pointCut()")
    public void logException(){
        System.out.println("方法运行异常......参数：{}");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around方法运行开始......参数：{}");
        Object result = joinPoint.proceed();
        System.out.println("Around方法运行结束......参数：{}");
        return result;
    }
}
