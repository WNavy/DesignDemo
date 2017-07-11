package main.com.whj.learn.factory.abstractFactory;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class BmwFactory implements AbstractFactory{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
