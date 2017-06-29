package main.com.whj.learn.decorator;

/**
 * Created by wuhaijun on 2017/6/26.
 */
public class Person implements Human {
    @Override
    public void sing() {
        System.out.println("想唱歌。。。");
    }

    @Override
    public void run() {
        System.out.println("想跑步。。。");
    }
}
