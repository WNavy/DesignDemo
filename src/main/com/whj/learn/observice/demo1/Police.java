package main.com.whj.learn.observice.demo1;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class Police implements Observer {

    @Override
    public void update() {
        System.out.println("警察：运钞车已经启动，随行保护~~~");
    }
}
