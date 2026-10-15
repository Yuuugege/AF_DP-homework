package com.Yuuu.af;

public class KFC implements Factory {
    @Override
    public Food getFood() {
        return new KFCHamburger(); // 返回肯德基的汉堡对象
    }

    @Override
    public Drink getDrink() {
        return new KFCCola(); // 返回肯德基的饮品对象
    }
}
