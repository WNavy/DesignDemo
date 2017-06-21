package main.com.whj.learn.singleton;

/**
 * Created by wuhaijun on 2017/6/21.
 */
public class SingletonModel {

    private static SingletonModel singletonModel;

    private SingletonModel(){}

    public static SingletonModel newInstance(){
        if(singletonModel == null){
            singletonModel = new SingletonModel();
        }
        return singletonModel;
    }
}
