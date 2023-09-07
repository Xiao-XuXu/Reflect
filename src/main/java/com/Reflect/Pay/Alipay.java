package com.Reflect.Pay;

public class Alipay implements Pay{
    @Override
    public void payOnline() {
        System.out.println("使用支付宝支付");
    }
}
