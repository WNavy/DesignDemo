package main.com.whj.learn.adapterAndDecoratorAndProxy.adapter;

/**
 * Created by wuhaijun on 2017/7/9.
 * 普通实现
 */
public class Chain implements NormalInterface {
    @Override
    public void charge() {
        System.out.println("中国电量 220V");
    }
}
