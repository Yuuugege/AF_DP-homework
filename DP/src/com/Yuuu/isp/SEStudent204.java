package com.Yuuu.isp;

public class SEStudent204 implements IStudentManage204, IStudentComputer204 {
    @Override
    public void ideologicalPoli204() {
        System.out.println("软件工程专业学生修学思政课");
    }

    @Override
    public void entrepreneurship204() {
        System.out.println("软件工程专业学生修学创业课");
    }

    @Override
    public void manage204() {
        System.out.println("软件工程专业学生修学管理课程");
    }

    @Override
    public void computer204() {
        System.out.println("软件工程专业学生修学计算机课程");
    }
}
