package cn.com.tjise.demo01.demo01.day002;



public class Person {

    String name;
    private int age;


    public void setAge(int num){
        if(age<0){
            System.out.println("年龄不合法");
        }else {
            age = num;
        }
    }

    public int getAge(){
        return age;
    }

    public void sayMethod(){
        System.out.println("我的年龄是："+age+",名字是："+name);
    }

}
