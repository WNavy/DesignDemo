package main.com.whj.learn.adapter;

/**
 * Created by wuhaijun on 2017/6/25.
 * 该适配器是类适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        this.specicRequest();
    }
}
