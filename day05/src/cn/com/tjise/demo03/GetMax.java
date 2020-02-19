package cn.com.tjise.demo03;

/*
*
* 封装：将具体实现隐藏起来
*
* 方法是一种封装
* private也是一种封装
*
* */

public class GetMax {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,8,6};
           int max =  getMax(arr);
        System.out.println("最大的数是："+ max);
    }

    public static int getMax(int[] arr) {
       int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max <arr[i]){
                max = arr[i];
            }
        }

     return max;
    }


}
