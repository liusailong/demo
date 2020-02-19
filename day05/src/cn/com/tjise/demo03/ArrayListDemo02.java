package cn.com.tjise.demo03;


import java.util.ArrayList;
import java.util.Random;

//随机生成20个数放入大集合中，挑出偶数放到先集合中
public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <20 ; i++) {
            int i1 = random.nextInt(100);
            integers.add(i1);
        }
        System.out.println(integers);
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if(integers.get(i)%2==0){
                integers1.add(integers.get(i));
            }
        }
        System.out.println(integers1);

    }

}
