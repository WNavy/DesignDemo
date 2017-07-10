package main.com.whj.learn.adapterAndDecoratorAndProxy.adapter;

/**
 * Created by wuhaijun on 2017/7/9.
 * 适配器角色，持有适配者对象引用
 */
public class Adapter implements NormalInterface {

    private Germany germany;

    public Adapter(Germany germany){
        this.germany = germany;
    }

    @Override
    public void charge() {
        germany.greatCharge();
    }
}
