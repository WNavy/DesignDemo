package main.com.whj.learn.singleton;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wuhaijun on 2017/6/21.
 */
public class Main {

    @Test
    /**单线程测试*/
    public void test1(){
        SingletonModel single1 = SingletonModel.newInstance();
        SingletonModel single2 = SingletonModel.newInstance();
        System.out.print(single1 == single2);
    }

    /**多线程测试*/
    public void test2(){

    }


}
