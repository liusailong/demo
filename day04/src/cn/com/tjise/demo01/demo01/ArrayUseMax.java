package cn.com.tjise.demo01.demo01;


public class ArrayUseMax {

    public static void main(String[] args) {

        int[] arr = {21,323,345465,887,23,};
        int max = arr[0];;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大的数是：" + max);

    }

}
