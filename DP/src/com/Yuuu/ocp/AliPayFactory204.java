package com.Yuuu.ocp;

public class AliPayFactory204 implements IPayFactory204 {
    @Override
    public Payment204 create204() {
        return new AliPay204();
    }
}
