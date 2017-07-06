package main.com.whj.learn.proxy;

/**
 * Created by wuhaijun on 2017/7/6.
 * 静态代理
 * 代理对象：该种方式是聚合代理，持有真实对象的引用
 */
public class UserDaoProxy implements UserDao {

    private  UserDao target;

    public UserDaoProxy(UserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事务。。。");
        target.save();
        System.out.println("提交事务。。。");
    }
}
