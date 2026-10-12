package com.Yuuu.ocp;

public class BankCardPayFactory204 implements IPayFactory204 {
    @Override
    public Payment204 create204() {
        return new BankCardPay204();
    }
}
