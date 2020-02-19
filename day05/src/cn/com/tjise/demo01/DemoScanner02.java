package cn.com.tjise.demo01;


import java.util.Random;
import java.util.Scanner;

public class DemoScanner02 {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println("请输入一个数猜随机数的大小");
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        for (int i2 = 0; i2 < 100; i2++) {
            if(i1>i){
                System.out.println("你输入的数太大了");
                i1 = scanner.nextInt();
            }else if (i1<i){
                System.out.println("你输入的数太小了");
                i1 = scanner.nextInt();
            }else {
                System.out.println("恭喜你！！！猜对了");
                break;
            }
        }

    }

}
