package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class JdkProxy {

    private Object target;

    public JdkProxy(Object target){
        this.target = target;
    }

    public Object getNewProxyInstance(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new JdkInvocationHandler(target));
    }


}
