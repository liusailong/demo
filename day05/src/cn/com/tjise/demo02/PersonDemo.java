package cn.com.tjise.demo02;


import java.util.ArrayList;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("迪丽热巴",12);
        Person person1 = new Person("古力娜扎" ,23);
        Person person3 = new Person("小何" ,23);
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(person);
        peoples.add(person1);
        peoples.add(person3);
        for (int i = 0; i <peoples.size() ; i++) {
            System.out.println(peoples.get(i));
        }


    }

}
