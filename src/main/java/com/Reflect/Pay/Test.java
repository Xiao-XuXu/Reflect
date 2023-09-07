package com.Reflect.Pay;

public class Test {
    public static void main(String[] args) {
        Pay aliPay=new Alipay();
        Pay wechatPay=new WeChatPay();

        pay(aliPay);     // 调用pay方法，传入Alipay对象
        pay(wechatPay);  // 调用pay方法，传入WeChatPay对象
    }

    //方法的形参是接口，具体传入的是实现类的对象
    private static void pay(Pay aliPay) {
        aliPay.payOnline();
    }
}

