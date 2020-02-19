package cn.com.tjise.demo01.demo01.day002;


public class MethodPhoneReturn {

    public static void main(String[] args) {
        Phone phone2 = getPhone();
        System.out.println(phone2.brand);
    }

    public static Phone getPhone(){

        Phone phone  = new Phone();
        phone.brand="小米";
        phone.color="陶瓷版";

        return phone;
    }

}
