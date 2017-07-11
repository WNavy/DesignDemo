package main.com.whj.learn.factory.factory;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class BmwFactory implements AbstractFactory {

    @Override
    public Car create() {
        return new BMW();
    }
}
