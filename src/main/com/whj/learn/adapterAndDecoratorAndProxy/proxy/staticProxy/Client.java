package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.staticProxy;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class Client {
    public static void main(String[] args){
        Dao proxy = new DaoProxy(new DaoImpl());
        proxy.auth();
    }
}
