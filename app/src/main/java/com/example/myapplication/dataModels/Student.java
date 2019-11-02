package com.example.myapplication.dataModels;

import com.example.myapplication.MainActivity;

public class Student {
    private String studentName, studentID, studentCourse;

    public Student(){

        //
    }

    public Student(String name, String id, String course){

     this.studentName=name;
     this.studentID=id;
     this.studentCourse=course;



    }

    public String getName(){
        return studentName;



    }
    public String getID(){
        return studentID;



    }
    public String getCourse(){
        return studentCourse;

    }

    public void setName(String name){

        this.studentName=name;
    }

    public void setID(String id){

        this.studentID=id;
    }

    public void setCourse(String course){

        this.studentCourse=course;
    }
}






