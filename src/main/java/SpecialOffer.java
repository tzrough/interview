public class SpecialOffer {

    //属性(不写 get、set 方法，直接赋值即可)
    int enoughNum = 3;
    int freeNum = 1;
    double price = 3.5;

    //根据最终获得的商品数量，打印用户最少应支付的价格
    public void getAmountByLastCount(int lastCount){
        // 一组满赠的数量
        int payAndFreeGroupNum = enoughNum + freeNum;

        // 包含满赠的组数
        int payGroupNum = lastCount / payAndFreeGroupNum;
        // 不满满赠的个数
        int notEnoughNum = lastCount % payAndFreeGroupNum;

        // （满赠组数 * 满赠单组需支付的个数 + 不满满赠的个数） * 单价
        double payPrice = (enoughNum * payGroupNum + notEnoughNum) * price;

        System.out.println(payPrice);
    }

}
