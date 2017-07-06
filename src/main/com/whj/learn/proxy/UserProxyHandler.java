package main.com.whj.learn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class UserProxyHandler implements InvocationHandler {

    private Object target;

    public UserProxyHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("自定义事务开始~~~~");
        Object result = method.invoke(target,args);
        System.out.println("自定义事务结束~~~~");
        return result;
    }
}
