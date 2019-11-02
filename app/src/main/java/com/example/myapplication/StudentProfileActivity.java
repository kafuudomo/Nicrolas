package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StudentProfileActivity extends AppCompatActivity {
    private String profileString="Hi, my name is [name].\n"+
                                    "My student ID is [id].\n"+
                                    "My course is [course].\n";
    private String studentName, studentID,studentCourse;
    private TextView tvStudentProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);

        studentName=getIntent().getStringExtra("name");
        studentID=getIntent().getStringExtra("id");
        studentCourse=getIntent().getStringExtra("course");

        replaceData();

        tvStudentProfile=findViewById(R.id.tvStudentProfile);
        tvStudentProfile.setText(profileString);

    }

    private void replaceData(){

        profileString=profileString.replace("[name]",studentName);
        profileString=profileString.replace("[id]",studentID);
        profileString=profileString.replace("[course]",studentCourse);


    }


}
