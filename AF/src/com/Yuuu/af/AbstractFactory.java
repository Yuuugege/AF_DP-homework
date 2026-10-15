package com.Yuuu.af;

public class AbstractFactory {
    public static void main(String[] args) {
        Factory Mfactory = new McDonalds(); // 实例化麦当劳快餐工厂
        Factory Kfactory = new KFC(); // 实例化肯德基快餐工厂

        Food Mfood = Mfactory.getFood(); // 实例化麦当劳工厂制造Food
        Food Kfood = Kfactory.getFood();

        Drink Mdrink = Mfactory.getDrink(); // 实例话麦当劳工厂制造饮品
        Drink Kdrink = Kfactory.getDrink();

        Mfood.getfood();
        Mdrink.getdrink();

        Kfood.getfood();
        Kdrink.getdrink();
    }
}
