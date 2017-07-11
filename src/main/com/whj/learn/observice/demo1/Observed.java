package main.com.whj.learn.observice.demo1;

/**
 * Created by wuhaijun on 2017/7/10.
 * 抽象的被观察者
 */
public interface Observed {

    /**注册观察者*/
    void registerObserver(Observer observer);

    /**移除观察者*/
    void removeObserver(Observer observer);

    /**通知观察者*/
    void notifyObservers();

}
