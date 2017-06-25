package main.com.whj.learn.singleton;


/**
 * Created by wuhaijun on 2017/6/21.
 * 懒汉单例--非线程安全
 */
public class SingletonModel {

    private static SingletonModel singletonModel = null;

    private SingletonModel(){
        System.out.println("创建了一个新实例");
        slowDown();
    }

    public static synchronized SingletonModel newInstance(){
        if(singletonModel == null){
            singletonModel = new SingletonModel();
        }
        return singletonModel;
    }

    private void slowDown(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
