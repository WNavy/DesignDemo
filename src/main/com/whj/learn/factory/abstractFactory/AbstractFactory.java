package main.com.whj.learn.factory.abstractFactory;

/**
 * Created by wuhaijun on 2017/7/11.
 * 抽象工厂模式：包含两个不同的产品等级，除此以外，跟工厂方法模式差别不大
 */
public interface AbstractFactory {

    Engine createEngine();

    Aircondition createAircondition();
}
