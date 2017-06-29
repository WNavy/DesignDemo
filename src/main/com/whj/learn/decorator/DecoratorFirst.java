package main.com.whj.learn.decorator;

/**
 * Created by wuhaijun on 2017/6/26.
 * 具体的装饰角色
 */
public class DecoratorFirst extends Decorator {

    public DecoratorFirst(Human human) {
        super(human);
    }

    public void sing(){
        super.sing();
        System.out.println("去天秤座。。。");
    }

    public void run(){
        super.run();
        System.out.println("去森林公园。。。");
    }
}
