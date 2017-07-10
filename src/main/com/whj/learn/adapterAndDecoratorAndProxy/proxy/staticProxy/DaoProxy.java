package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.staticProxy;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class DaoProxy implements Dao {

    private DaoImpl daoImpl;

    public DaoProxy(DaoImpl daoImpl){
        this.daoImpl = daoImpl;
    }

    @Override
    public void auth() {

        System.out.println("验证前打印日志~~~");
        daoImpl.auth();
        System.out.println("验证后打印日志~~~");

    }
}
