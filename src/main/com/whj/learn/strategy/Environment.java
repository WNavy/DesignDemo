package main.com.whj.learn.strategy;

/**
 * Created by wuhaijun on 2017/7/12.
 */
public class Environment {

    private String name;
    private Strategy strategy;

    public Environment(String name,Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public void operate(){
        strategy.operate();
    }

}
