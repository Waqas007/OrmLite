package com.example.waqas.ormlite;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by Waqas on 6/23/2015.
 */
public class TeacherDetails implements Serializable {

    @DatabaseField(generatedId = true, columnName = "teacher_id")
    public int teacherId;

    @DatabaseField(columnName = "teacher_name")
    public String teacherName;

    public String address;

    public TeacherDetails() {
    }

    public TeacherDetails(String address, String name) {
        this.address = address;
        this.teacherName = name;
    }
}
