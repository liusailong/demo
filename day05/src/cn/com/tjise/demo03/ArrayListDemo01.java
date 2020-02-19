package cn.com.tjise.demo03;

import java.util.ArrayList;

public class ArrayListDemo01 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(21);
        integers.add(23);
        integers.add(34);
        getInter(integers);
    }

    public static void getInter(ArrayList<Integer> integers) {
        System.out.println(integers);
        for (int i = 0; i <integers.size() ; i++) {
            if (i==0){
                System.out.print("{"+integers.get(i));
            }else {
                System.out.print("@"+integers.get(i));
            }
        }
        System.out.println("}");

    }

}
