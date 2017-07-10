package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.cglibProxy;

import main.com.whj.learn.adapter.Target;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class CglibProxy implements MethodInterceptor{

    public <T> T getNewProxyInstance(T target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T)enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("验证前打印日志~~~");
        Object result = methodProxy.invokeSuper(obj,args);
        System.out.println("验证后打印日志~~~");
        return result;

    }
}
