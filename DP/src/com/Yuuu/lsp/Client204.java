package com.Yuuu.lsp;

public class Client204 {
    public static void main(String[] args) {
        // 原有类对象
        SwallowOld204 swallowOld204 = new SwallowOld204();
        swallowOld204.fly204();
        swallowOld204.eat204();

        OstrichOld204 ostrichOld204 = new OstrichOld204();
        ostrichOld204.fly204();
        ostrichOld204.eat204();

        // 改造后的类对象
        Swallow204 swallow204 = new Swallow204();
        swallow204.fly204();
        swallow204.eat204();

        Ostrich204 ostrich204 = new Ostrich204(); // 鸵鸟不会飞
        ostrich204.eat204();
    }
}
