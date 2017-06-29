package main.com.whj.learn.decorator;

/**
 * Created by wuhaijun on 2017/6/26.
 * 构建装饰角色
 */
public abstract class Decorator implements Human {

    private Human human;

    public Decorator(Human human){
        this.human = human;
    }

    public void sing(){
        human.sing();
    }

    public void run(){
        human.run();
    }
}
