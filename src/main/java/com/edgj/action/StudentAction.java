package com.edgj.action;

import com.edgj.action.model.Student;
import com.edgj.action.utils.DataUtil;

import java.util.List;

public class StudentAction {
    private Student student;

    private List<Student> studentList;

    public String add() {
        System.out.println(student.getStudentName());
        DataUtil.addStudent(student);
        return list();
    }
    public String list() {
        studentList = DataUtil.getStudentList();
        return "list";
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public List<Student> getStudentList() {

        return studentList;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Student getStudent() {

        return student;
    }

}
