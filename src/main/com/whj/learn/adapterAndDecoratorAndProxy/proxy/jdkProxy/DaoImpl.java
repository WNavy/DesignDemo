package main.com.whj.learn.adapterAndDecoratorAndProxy.proxy.jdkProxy;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class DaoImpl implements Dao {

    @Override
    public void auth() {
        System.out.println("进行权限验证~~~");
    }
}
