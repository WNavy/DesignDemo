package main.com.whj.learn.observice.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaijun on 2017/7/10.
 * 具体被观察对象
 * 天气数据
 */
public class WeatherData implements Observed {

    private List<Observer> observers;

    private float temperature; //温度
    private float humidity; //湿度
    private float pressure; //气压
    private List<Float> forecastTemperatures; //未来几天的温度

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.size() > 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,
                                float pressure,
                                List<Float> forecastTemperatures){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.forecastTemperatures = forecastTemperatures;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Float> getForecastTemperatures() {
        return forecastTemperatures;
    }
}
