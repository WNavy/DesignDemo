package main.com.whj.learn.strategy;

/**
 * Created by wuhaijun on 2017/7/12.
 */
public class StrategyFirst implements Strategy {

    @Override
    public void operate() {
        System.out.println("策略一：找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
