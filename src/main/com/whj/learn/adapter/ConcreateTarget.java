package main.com.whj.learn.adapter;

/**
 * Created by wuhaijun on 2017/6/25.
 */
public class ConcreateTarget implements Target{

    @Override
    public void request() {
        System.out.println("普通的方法。。。");
    }
}
