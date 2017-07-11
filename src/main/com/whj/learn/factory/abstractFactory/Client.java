package main.com.whj.learn.factory.abstractFactory;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class Client {
    public static void main(String[] args){
        BmwFactory factory = new BmwFactory();
        factory.createEngine();
        factory.createAircondition();
    }
}
