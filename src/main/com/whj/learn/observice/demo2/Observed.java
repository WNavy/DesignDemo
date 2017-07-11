package main.com.whj.learn.observice.demo2;


/**
 * Created by wuhaijun on 2017/7/10.
 * 被观察者
 */
public interface Observed {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
