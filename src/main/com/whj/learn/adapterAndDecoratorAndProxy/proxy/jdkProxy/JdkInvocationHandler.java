package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class JdkInvocationHandler implements InvocationHandler {

    private Object target;

    public JdkInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("验证前打印日志~~~");
        Object result = method.invoke(target,args);
        System.out.println("验证后打印日志~~~");
        return result;
    }
}
