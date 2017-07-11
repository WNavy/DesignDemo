package main.com.whj.learn.factory.factory;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class Client {

    public static void main(String[] args){
        BmwFactory bmwFactory = new BmwFactory();
        bmwFactory.create();

        BenzFactory benzFactory = new BenzFactory();
        benzFactory.create();
    }
}
