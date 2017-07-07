package main.com.whj.learn.proxy.demo;

import org.junit.jupiter.api.Test;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class Client {

    @Test
    public void test(){
        StudentService service = new StudentService();
        StudentService proxy = new CglibProxy("jack").getInstance(service);
        proxy.select();
    }

    @Test
    public void test2(){
        StudentService service = new StudentService();
        StudentService proxy = new CglibProxy("Teacher").getInstance(service,new Class[]{String.class},new Object[]{"jack"});
        proxy.delete();
    }
}
