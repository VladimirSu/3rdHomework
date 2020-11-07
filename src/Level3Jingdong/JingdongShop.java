package Level3Jingdong;

public class JingdongShop implements ReciveOrder,ArrivalNotice,SendPackage{

    @Override
    public void arrivalNotice() {
        System.out.println("您的订单已经到达菜鸟驿站。");
    }

    @Override
    public void reciveOrder() {
        System.out.println("已经收到您的订单。");
    }

    @Override
    public void sendPackage() {
        System.out.println("您的订单已经发出，请耐心等待。");
    }
}
