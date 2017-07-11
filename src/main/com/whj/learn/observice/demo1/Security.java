package main.com.whj.learn.observice.demo1;

/**
 * Created by wuhaijun on 2017/7/10.
 * 具体的观察者
 */
public class Security implements Observer {

    @Override
    public void update() {
        System.out.println("保镖：运输车已启动，保安贴身保护~~~");
    }
}
