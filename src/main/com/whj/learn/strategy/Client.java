package main.com.whj.learn.strategy;

/**
 * Created by wuhaijun on 2017/7/12.
 */
public class Client {

    public static void main(String[] args){
        Strategy fist = new StrategyFirst();
        Environment environment = new Environment("刘备",fist);
        environment.operate();
    }
}
