package main.com.whj.learn.adapterAndDecoratorAndProxy.adapter;

/**
 * Created by wuhaijun on 2017/7/9.
 */
public class Client {

    public static void main(String[] args){
        NormalInterface chain = new Chain();
        chain.charge();

        NormalInterface germany = new Adapter(new Germany());
        germany.charge();
    }
}
