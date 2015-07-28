package com.example.waqas.ormlite;

import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by Waqas on 6/23/2015.
 */
public class StudentDetails implements Serializable {


    public static final String ID_FIELD = "student_id";
    public static final String TEACHER_ID_FIELD = "teacher_id";


    @DatabaseField(generatedId = true , columnName =ID_FIELD )
    public int studentId;

    @DatabaseField(columnName = "student_name")
    public String studentName;

    public String address;

    @DatabaseField(canBeNull = false,foreign = true,foreignAutoRefresh = true)
    public TeacherDetails teacher;

    @DatabaseField(columnName = "added_date")
    public String addedDate;

    public StudentDetails(String name, String address, TeacherDetails teacher) {
        this.studentName = name;
        this.address = address;
        this.teacher = teacher;
    }

    public StudentDetails() {
    }

}
