package main.com.whj.learn.proxy.demo;

import org.springframework.cglib.proxy.*;
import java.lang.reflect.Method;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class CglibProxy implements MethodInterceptor {

    private String name;

    public CglibProxy(String name){
        this.name = name;
    }

    //创建代理对象
    public <T> T getInstance(T target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallbacks(new Callback[]{this, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new MyProxyFilter());
        //enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    public <T> T getInstance(T target,Class[] args,Object[] argsValue){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallbacks(new Callback[]{this, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new MyProxyFilter());
        return (T) enhancer.create(args,argsValue);
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        if ("Teacher".equalsIgnoreCase(name)){
            System.out.println("增删改查开始执行……");
            //Object result = method.invoke(obj,args);
            Object result = methodProxy.invokeSuper(obj,args);
            System.out.println("增删改查执行结束……");
            return result;
        }else{
            System.out.println("没有权限");
            return null;
        }
    }
}
