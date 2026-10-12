package com.Yuuu.ocp;

public class AliPay204 implements Payment204 {
    @Override
    public void pay204() {
        System.out.println("使用支付宝支付");
    }
}
