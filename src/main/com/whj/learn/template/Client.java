package main.com.whj.learn.template;

/**
 * Created by wuhaijun on 2017/7/11.
 */
public class Client {

    public static void main(String[] args){
        AbstractPeople student = new Student();
        AbstractPeople teacher = new Teacher();

        student.prepareGotoSchool();
        System.out.println("*************");
        teacher.prepareGotoSchool();
    }
}
