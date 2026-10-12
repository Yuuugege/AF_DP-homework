package com.Yuuu.carp;

import java.util.ArrayList;
import java.util.List;

public class School204 {
    // 聚合关系：学校与学生彼此可单独存在
    private List<Student204> students204 = new ArrayList<>();

    public void addStudent204(Student204 student204) {
        students204.add(student204);
    }

    public List<Student204> getStudents204() {
        return students204;
    }
}
