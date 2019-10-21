package work3.com.zut.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Myaspect {
    public void myBefore(JoinPoint joinpoint){
        System.out.print("前置通知：执行权限检查...");
        System.out.print("目标类是：" + joinpoint.getTarget());
        System.out.println("，被植入增强处理的目标方法为：" + joinpoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinpoint){
        System.out.print("后置通知：记录日志...");
        System.out.println("被植入增强处理的目标方法是：" + joinpoint.getSignature().getName());
    }

    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕开始：执行目标方法之前，开始事务...");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕结束：执行目标方法之后，关闭事务...");
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知：出错了" + e.getMessage());
    }

    public void myAfter(){
        System.out.println("最终通知：方法结束后的释放资源...");
    }
}
