package com.edgj.action.utils;


import com.edgj.action.model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    private static int studentIndex;
    private static List<Student> studentList;
    static{
        studentList = new ArrayList<>();
        Student student = new Student();
        student.setStudentId(studentIndex++);
        student.setStudentAge(18);
        student.setStudentName("张三");
        studentList.add(student);

        student = new Student();
        student.setStudentId(studentIndex++);
        student.setStudentAge(18);
        student.setStudentName("李四");
        studentList.add(student);
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void addStudent(Student student) {
        student.setStudentId(studentIndex++);
        studentList.add(student);
    }
}
