package main.com.whj.learn.proxy;

/**
 * Created by wuhaijun on 2017/7/6.
 * 被委托角色
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("-----已经保存数据------");
    }
}
