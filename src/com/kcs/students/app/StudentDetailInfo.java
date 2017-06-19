package com.kcs.students.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lina on 2017.06.19.
 */
public class StudentDetailInfo {
    private Student student;
    private List<StudentAddress> studentAddresses = new ArrayList<>();
    private List<StudentMark> studentMarks = new ArrayList<>();

    public StudentDetailInfo(Student student, List<StudentAddress> studentAddresses, List<StudentMark> studentMarks) {
        this.student = student;
        this.studentAddresses = studentAddresses;
        this.studentMarks = studentMarks;
    }

    public Student getStudent() {
        return student;
    }

    public List<StudentAddress> getStudentAddresses() {
        return studentAddresses;
    }

    public List<StudentMark> getStudentMarks() {
        return studentMarks;
    }
}
