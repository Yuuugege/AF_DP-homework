package com.Yuuu.af;

/**
 * 具体工厂类
 * @author Yuuu
 *
 */

public class McDonalds implements Factory {
    @Override
    public Food getFood() {
        return new McDonaldsHamburger(); // 返回麦当劳的汉堡对象
    }

    @Override
    public Drink getDrink() {
        return new McDonaldsCola(); // 返回麦当劳的饮品对象
    }
}
