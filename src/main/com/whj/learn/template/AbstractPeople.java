package main.com.whj.learn.template;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public abstract class AbstractPeople {

    //定义模板流程
    public void prepareGotoSchool(){

        dressUp();
        eatBreakfast();
        takeThings();

    }

    protected abstract void dressUp();
    protected abstract void eatBreakfast();
    protected abstract void takeThings();
}
