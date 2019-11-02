package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.myapplication.dataModels.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewStudent;
    private ArrayList<Student> arrayListStudent=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewStudent=findViewById(R.id.listViewStudent);

        arrayListStudent.add(new Student("Uzuki","001","CuteCGSS"));
        arrayListStudent.add(new Student("Rin","002","CoolCGSS"));
        arrayListStudent.add(new Student("Jeff","003","PassionCGSS"));
        arrayListStudent.add(new Student("Saechi","004","CuteCGSS"));
        arrayListStudent.add(new Student("Hearto","069","PassionCGSS"));

        StudentAdapter adapter=new StudentAdapter(arrayListStudent,this);

        listViewStudent.setAdapter(adapter);
    }
}
