package main.com.whj.learn.observice.demo2;

/**
 * Created by wuhaijun on 2017/7/11.
 * 具体的观察者
 * 显示当前天气的公告牌
 */
public class CurrentConditionsDisplay implements DisplayElement,Observer {

    private WeatherData weatherData;
    private float temperature; //温度
    private float humidity; //湿度
    private float pressure; //气压

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("当前温度为：" + this.temperature + "°C");
        System.out.println("当前湿度为：" + this.humidity);
        System.out.println("当前气压为：" + this.pressure);

    }

    @Override
    public void update() {

        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
