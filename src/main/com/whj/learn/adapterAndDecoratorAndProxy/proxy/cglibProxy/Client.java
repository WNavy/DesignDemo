package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.cglibProxy;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class Client {

    public static void main(String[] args){
        DaoImpl proxy = new CglibProxy().getNewProxyInstance(new DaoImpl());
        proxy.auth();
    }
}
