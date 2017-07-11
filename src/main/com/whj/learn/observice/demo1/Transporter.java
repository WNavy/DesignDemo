package main.com.whj.learn.observice.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaijun on 2017/7/10.
 * 具体的被观察者
 */
public class Transporter implements Observed {

    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.size() > 0){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update();
        }
    }
}
