package e07.test01;

class MoblieShop {
    InnerPurchaseMoney purchaseMoney1;
    InnerPurchaseMoney purchaseMoney2;
    private int mobileAmount;

    MoblieShop() {
        purchaseMoney1 = new InnerPurchaseMoney(20000);
        purchaseMoney2 = new InnerPurchaseMoney(10000);
    }

    void setMobileAmount(int m) {
        mobileAmount = m;
    }

    int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyValue;

        InnerPurchaseMoney(int m) {
            moneyValue = m;
        }

        void buyMobile() {
            if (moneyValue >= 20000) {
                mobileAmount = mobileAmount - 6;
                System.out.println("用价值" + moneyValue + "的内部购物卷买了6部手机");
            } else if (moneyValue < 20000 && moneyValue >= 10000) {
                mobileAmount = mobileAmount - 3;
                System.out.println("用价值" + moneyValue + "的内部购物卷买了3部手机");
            }
        }
    }

}
public class NewYear {
    public static void main(String args[]) {
        MoblieShop shop = new MoblieShop();
        shop.setMobileAmount(30);
        System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
    }
}
