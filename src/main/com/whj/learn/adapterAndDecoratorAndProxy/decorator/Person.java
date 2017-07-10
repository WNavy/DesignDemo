package main.com.whj.learn.adapterAndDecoratorAndProxy.decorator;

/**
 * Created by wuhaijun on 2017/7/9.
 */
public class Person implements People {

    @Override
    public void wearClothes() {
        System.out.println("早上起床准备穿衣服~~~");
    }
}
