package com.kcs.students.app;

import java.util.Date;

/**
 * Created by Lina on 2017.06.19.
 */
public class StudentMark {
    private int id;
    private int student_id;
    private String title;
    private int mark;
    private Date date;

    public StudentMark(){};

    public StudentMark(int id, int student_id, String title, int mark, Date date) {
        this.id = id;
        this.student_id = student_id;
        this.title = title;
        this.mark = mark;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getTitle() {
        return title;
    }

    public int getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }
}
