package com.Reflect.Pay;

public class WeChatPay implements Pay{
    @Override
    public void payOnline() {
        System.out.println("使用微信支付");
    }
}
