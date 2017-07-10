package main.com.whj.learn.adapterAndDecoratorAndProxy.decorator;

/**
 * Created by wuhaijun on 2017/7/9.
 */
public class Director1 implements People {

    private People people;

    public Director1(People people){
        this.people = people;
    }

    @Override
    public void wearClothes() {
        people.wearClothes();
        System.out.println("上衣穿短袖");
    }
}
