package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.jdkProxy;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class Client {

    public static void main(String[] args){

        Dao proxy = (Dao) new JdkProxy(new DaoImpl()).getNewProxyInstance();
        proxy.auth();

    }
}
