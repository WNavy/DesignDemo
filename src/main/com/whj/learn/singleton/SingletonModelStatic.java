package main.com.whj.learn.singleton;

/**
 * Created by wuhaijun on 2017/6/25.
 * 静态内部类方式的单例模式(线程安全)
 */
public class SingletonModelStatic {

    private static class MySingle {
        private static SingletonModelStatic singleModel = new SingletonModelStatic();
    }

    public SingletonModelStatic(){}

    public static SingletonModelStatic getInstance(){
        return MySingle.singleModel;
    }
}
