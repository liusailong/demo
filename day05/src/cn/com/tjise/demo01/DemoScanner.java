package cn.com.tjise.demo01;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("输入的整数为："+i);

        String next = scanner.next();
        System.out.println("输入的字符串为：" + next);
    }

}
