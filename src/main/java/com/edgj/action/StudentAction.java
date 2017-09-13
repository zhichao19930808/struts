package com.edgj.action;

import com.edgj.action.model.Student;
import com.edgj.action.utils.DataUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class StudentAction extends ActionSupport{
    private Student student;

    private List<Student> studentList;

    public String add() {
        System.out.println(student.getStudentName());
        DataUtil.addStudent(student);
        return list();
    }

    public void validateAdd() {
        if (student == null) {
            addFieldError("student","学生信息不能为空");
            return;
        }
        if (student.getStudentName() == null || student.getStudentName().trim().equals("")) {
            addFieldError("student.studentName","学生姓名不能为空");
            return;
        }
        if (student.getStudentAge() == 0) {
            addFieldError("student.studentAge","年龄不能为空");
        }
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
