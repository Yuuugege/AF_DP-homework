package com.Yuuu.ocp;

public class Client2204 {
    public static void main(String[] args) {
        String data204 = "3, 1, 4, 1, 5, 9, 2, 6";

        SortStrategy204 strategy204 = new BubbleStrategy204(); // 选择冒泡排序
        strategy204.sort204(data204);
    }
}
