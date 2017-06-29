package main.com.whj.learn.decorator;

/**
 * Created by wuhaijun on 2017/6/26.
 * 具体的装饰角色
 */
public class DecoratorSecond extends Decorator {

    public DecoratorSecond(Human human) {
        super(human);
    }

    public void sing(){
        super.sing();
        System.out.println("点一首<我要你>。。。");
    }

    public void run(){
        super.run();
        System.out.println("跑马拉松。。。");
    }
}
