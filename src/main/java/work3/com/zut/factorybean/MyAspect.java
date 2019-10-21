package work3.com.zut.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable{
        check_Permissions();
        //aaaa
        Object obj = methodInvocation.proceed();
        log();
        return obj;
    }
    public void check_Permissions(){
        System.out.println("...检查权限...");
    }
    public void log(){
        System.out.println("...记录日志...");
    }
}
