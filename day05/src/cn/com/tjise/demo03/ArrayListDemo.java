package cn.com.tjise.demo03;

import java.util.ArrayList;
import java.util.Random;

//生成6个1到33的整数，并且遍历输出
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer>  integers  = new ArrayList<>();
        Random random  = new Random();
        for (int j = 0; j < 6 ; j++) {
            int i = random.nextInt(33);
            i = i+1;
            integers.add(i);
        }
        System.out.println(integers);
        for (int i = 0; i <integers.size() ; i++) {
            System.out.println(integers.get(i));

        }


    }
}