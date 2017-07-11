package main.com.whj.learn.template;


/**
 * Created by wuhaijun on 2017/7/11.
 */
public class Student extends AbstractPeople {

    @Override
    protected void dressUp() {
        System.out.println("穿校服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈做好的早饭");
    }

    @Override
    protected void takeThings() {
        System.out.println("背上书包，带上家庭作业和红领巾");
    }
}
