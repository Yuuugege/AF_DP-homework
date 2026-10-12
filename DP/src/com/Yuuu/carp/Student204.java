package com.Yuuu.carp;

import java.util.List;

public class Student204 {
    // 组合关系：心脏与人是共生关系，随学生对象的创建而创建、销毁而销毁
    private Heart204 heart204 = new Heart204();

    // 关联关系：学生与教师之间是引用关系
    private List<Teacher204> teachers204;

    public Heart204 getHeart204() {
        return heart204;
    }

    public List<Teacher204> getTeachers204() {
        return teachers204;
    }

    public void setTeachers204(List<Teacher204> teachers204) {
        this.teachers204 = teachers204;
    }
}
