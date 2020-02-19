package cn.com.tjise.demo01.demo01;


public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0;i<arr.length/2;i++){
            int s = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = s;
        }
        for (int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
