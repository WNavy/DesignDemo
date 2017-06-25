package main.com.whj.learn.adapter;

/**
 * Created by wuhaijun on 2017/6/25.
 * 委托方式
 */
public class AdapterRef implements Target{

    private Adaptee adaptee;

    public AdapterRef(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specicRequest();
    }
}
