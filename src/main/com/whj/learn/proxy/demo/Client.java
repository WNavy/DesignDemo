package main.com.whj.learn.proxy.demo;

import org.junit.jupiter.api.Test;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class Client {

    @Test
    public void test(){
        StudentService service = new StudentService();
        StudentService proxy = (StudentService) new CglibProxy("jack").newInstance(service);
        proxy.service();
    }
}
