package Level3Jingdong;

public class Main {

    public static void main(String[] args) {
        System.out.println("我要买电脑了，开始逛京东");
        System.out.println("看到了坠机堡垒，马上下单");
        JingdongShop jingdongShop = new JingdongShop();
        Me me = new Me();
        me.buySomething(jingdongShop);
        jingdongShop.sendPackage();
        jingdongShop.arrivalNotice();
        me.getComputer();
    }
}
