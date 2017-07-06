package main.com.whj.learn.proxy;

import org.junit.jupiter.api.Test;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class Main {

    //静态代理
    @Test
    public void staticProxyTest(){
        UserDao target = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }

    //JDK代理测试
    @Test
    public void JdkProxyTest(){
        UserDao target = new UserDaoImpl();
        System.out.println("目标对象原始类型:" + target.getClass());
        //给目标对象创建代理对象
        UserDao proxy = (UserDao) new JdkProxyFactory(target).getProxyInstance();
        System.out.println("内存中动态生成的代理对象:" + proxy.getClass());
        proxy.save();
    }

    //JDK代理，自定义事件处理器
    @Test
    public void JdkProxyCustomizedTest(){
        UserDao target = new UserDaoImpl();
        UserDao proxy = (UserDao) new JdkProxyFactory(target).getProxyInstanceCustomized();
        proxy.save();
    }

    //Cglib代理测试
    @Test
    public void CglibProxyText(){
        TargetUser targetUser = new TargetUser();
        TargetUser proxy = (TargetUser)new CglibProxyFactory(targetUser).getInstance();
        proxy.save();
    }
}
