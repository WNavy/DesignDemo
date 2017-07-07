package main.com.whj.learn.proxy.demo;

/**
 * Created by wuhaijun on 2017/7/6.
 */
public class StudentService {

    public void service(){
        add();
        delete();
        update();
        select();
    }


    public void add(){
        System.out.println("增加学生……");
    }

    public void delete(){
        System.out.println("删除学生……");
    }

    public void update(){
        System.out.println("更新学生……");
    }

    public void select(){
        System.out.println("查询学生……");
    }
}
