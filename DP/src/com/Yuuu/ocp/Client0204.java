package com.Yuuu.ocp;

public class Client0204 {
    public static void main(String[] args) {
        String payType204 = "aliPay";

        if ("aliPay".equals(payType204)) {
            new AliPayOld204().pay204();
        } else if ("weChatPay".equals(payType204)) {
            new WeChatPayOld204().pay204();
        } else if ("bankCardPay".equals(payType204)) {
            new BankCardPayOld204().pay204();
        }
    }
}
