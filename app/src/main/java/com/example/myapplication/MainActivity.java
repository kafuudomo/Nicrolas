package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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

        listViewStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Student student= (Student) parent.getAdapter().getItem(position);

                Intent i=new Intent(MainActivity.this, StudentProfileActivity.class);
                i.putExtra("name",student.getName());
                i.putExtra("id",student.getID());
                i.putExtra("course",student.getCourse());
                startActivity(i);
            }
        });
    }
}
