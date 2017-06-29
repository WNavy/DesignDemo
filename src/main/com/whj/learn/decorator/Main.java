package main.com.whj.learn.decorator;

import org.junit.jupiter.api.Test;

/**
 * Created by wuhaijun on 2017/6/26.
 */
public class Main {

    @Test
    public void test(){
        Human human = new Person();
        Decorator decorator1 = new DecoratorSecond(new DecoratorFirst(human));
        decorator1.sing();
    }
}
