package main.com.whj.learn.proxy.demo;

import org.springframework.cglib.proxy.CallbackFilter;
import java.lang.reflect.Method;

/**
 * Created by wuhaijun on 2017/7/7.
 * 返回的值是指代回调函数中的下标Callback[]
 */
public class MyProxyFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        if (!"select".equalsIgnoreCase(method.getName()))
            return 0;
        return 1;
    }
}
