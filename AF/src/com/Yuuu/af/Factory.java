package com.Yuuu.af;

/**
 * 工厂接口类/抽象类
 * @author Yuuu
 *
 */

public interface Factory {
    Food getFood(); // 声明制造食物方法

    Drink getDrink(); // 声明制造饮品方法
}
