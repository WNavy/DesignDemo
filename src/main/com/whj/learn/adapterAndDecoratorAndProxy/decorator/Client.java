package main.com.whj.learn.adapterAndDecoratorAndProxy.decorator;

/**
 * Created by wuhaijun on 2017/7/9.
 */
public class Client {

    public static void main(String[] args){
        Director2 director = new Director2(new Director1(new Person()));
        director.wearClothes();
    }
}
