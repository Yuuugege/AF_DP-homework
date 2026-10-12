package com.Yuuu.ocp;

// 旧版支付类：客户端需用 if-else 分支判断，新增支付方式要修改客户端，违反开闭原则
public class BankCardPayOld204 {
    public void pay204() {
        System.out.println("使用银行卡支付");
    }
}
