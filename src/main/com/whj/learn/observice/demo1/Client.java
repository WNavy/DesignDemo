package main.com.whj.learn.observice.demo1;

/**
 * Created by wuhaijun on 2017/7/10.
 */
public class Client {

    public static void main(String[] args){
        Transporter transporter = new Transporter();
        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();

        transporter.registerObserver(police);
        transporter.registerObserver(security);
        transporter.registerObserver(thief);

        transporter.notifyObservers();

    }
}
