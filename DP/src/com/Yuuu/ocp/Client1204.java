package com.Yuuu.ocp;

public class Client1204 {
    public static void main(String[] args) {
        IPayFactory204 factory204 = new AliPayFactory204();
        Payment204 payment204 = factory204.create204();
        payment204.pay204();
    }
}
