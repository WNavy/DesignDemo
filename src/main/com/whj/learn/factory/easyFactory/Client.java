package main.com.whj.learn.factory.easyFactory;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class Client {

    public static void main(String[] args){
        CarFactory factory = new CarFactory();
        Car benz = factory.create("benz");
        Car bmw = factory.create("bmw");
    }
}
