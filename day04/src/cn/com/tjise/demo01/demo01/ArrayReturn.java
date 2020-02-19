package cn.com.tjise.demo01.demo01;

/*
* 返回值为多个的时候可以采用数组的形式。
* */

public class ArrayReturn {


    public static void main(String[] args) {
        int[] ints = arrayNew(3, 4);
        System.out.println(ints);
        System.out.println("两数之和为："+ints[0]);
        System.out.println("两数之平均为："+ints[1]);
    }


    public static int[] arrayNew(int a , int b){
        int sum = a+b;
        int avg = sum/2;
        int[] arr = {sum,avg};

        return arr;

    }

}
