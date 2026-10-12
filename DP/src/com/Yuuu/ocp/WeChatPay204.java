package com.Yuuu.ocp;

public class WeChatPay204 implements Payment204 {
    @Override
    public void pay204() {
        System.out.println("使用微信支付");
    }
}
