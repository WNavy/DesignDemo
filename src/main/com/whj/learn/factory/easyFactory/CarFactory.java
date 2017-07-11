package main.com.whj.learn.factory.easyFactory;

/**
 * Created by wuhaijun on 2017/7/11.
 * 简单工厂方法
 */
public class CarFactory {

    public Car create(String type){

        switch (type){
            case "bmw":
                return new BMW();
            case "benz":
                return new Benz();
        }
        return null;
    }
}
