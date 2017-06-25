package main.com.whj.learn.adapter;

import org.junit.jupiter.api.Test;

/**
 * Created by wuhaijun on 2017/6/25.
 */
public class Main {

    @Test
    public void test1(){
        Target concreateTarget = new ConcreateTarget();
        Target adapter = new Adapter();
        concreateTarget.request();
        adapter.request();
    }

    @Test
    public void test2(){
        Target adapterRef = new AdapterRef(new Adaptee());
        adapterRef.request();
    }
}
