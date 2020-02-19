package cn.com.tjise.demo01.demo01.day002;



public class MethodPhone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "苹果";
        phone.color = "土豪金";
        phone.price = 122.434;

        getMethod(phone);

        phone.call("马云");
    }

    //在这里得到的是一个地址
    public static void getMethod(Phone pram){
        System.out.println(pram.brand);
        pram.call("赵云");

    }



}
