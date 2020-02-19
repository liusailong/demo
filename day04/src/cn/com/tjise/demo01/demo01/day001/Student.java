package cn.com.tjise.demo01.demo01.day001;


public class Student {

    //属性
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }



    //构造方法
    public Student(){
        System.out.println("调用了无参构造。。。。。。。。");
    }

    public Student(int age,String name){
        this.age = age;
        this.name = name;
        System.out.println("调用了有参构造。。。。。");
    }

}
