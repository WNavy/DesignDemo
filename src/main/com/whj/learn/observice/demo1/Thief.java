package main.com.whj.learn.observice.demo1;

/**
 * Created by wuhaijun on 2017/7/10.
 * 具体的观察者
 */
public class Thief implements Observer {

    @Override
    public void update() {
        System.out.println("强盗：运钞车已经出发，准备动手~~~");
    }
}
