package cn.com.tjise.demo01;

//输入三个数，求三个数中的最大值

import java.util.Scanner;

public class DemoScanner01 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数");
        int i1 = scanner.nextInt();
        System.out.println("请输入第三个数");
        int i2 = scanner.nextInt();
        int[] arr = {i,i1,i2};
        int max = arr[0];
        for(int j = 0;j<arr.length;j++){
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println("三个数中最大的是："+max);
    }

}
