package main.com.whj.learn.observice.demo2;

import java.util.List;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class ForecastDisplay implements Observer,DisplayElement {

    private WeatherData weatherData;
    private List<Float> forecastTemperatures; //未来几天的温度

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("未来几天的气温");
        for(int i = 0; i < forecastTemperatures.size(); i++){
            System.out.println("第" + i + "天：" + forecastTemperatures.get(i) + "°C");
        }
    }

    @Override
    public void update() {

        this.forecastTemperatures = weatherData.getForecastTemperatures();
        display();

    }
}
