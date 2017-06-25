package main.com.whj.learn.singleton;

import org.junit.jupiter.api.Test;

/**
 * Created by wuhaijun on 2017/6/21.
 */
public class Main {

    @Test
    /**单线程测试*/
    public void test1(){
        SingletonModel single1 = SingletonModel.newInstance();
        SingletonModel single2 = SingletonModel.newInstance();
        System.out.print(single1 == single2);
    }

    /**多线程测试
     *
     */
    @Test
    public void test2(){
        new MyThread("A").start();
        new MyThread("B").start();
        new MyThread("C").start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread extends Thread {
    public void run(){
        SingletonModel model = SingletonModel.newInstance();
        System.out.println(model);
    }
    public MyThread(String name){
        super(name);
    }
}
