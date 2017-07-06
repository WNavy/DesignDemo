package main.com.whj.learn.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class CglibProxyFactory implements MethodInterceptor{

    //维护目标独享
    private Object target;

    public CglibProxyFactory(Object target){
        this.target = target;
    }

   public Object getInstance(){
       Enhancer enhancer = new Enhancer();
       //设置父类
       enhancer.setSuperclass(target.getClass());
       //设置回调函数
       enhancer.setCallback(this);
       //返回代理对象
       return enhancer.create();
   }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
       System.out.println("Cglib代理事务开始。。。");
       //Object result = method.invoke(target,args);
        Object result = methodProxy.invokeSuper(obj,args);
       System.out.println("Cglib代理事务结束。。。");
       return result;
    }
}
