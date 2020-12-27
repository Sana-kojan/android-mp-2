package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Classes> sa = new ArrayList<>();
        Classes c1 = new Classes("Bio 110",  "11:00 am","Su-Tu-Th",false,81, R.drawable.bio);
        Classes c2 = new Classes("CSC 122", "15:00 Pm","Su-Tu-Th",true,81, R.drawable.cs);
        Classes c3 = new Classes("CSC 125",  "09:00 am","Su-Tu-Th",false,81,R.drawable.cs);
        Classes c4 = new Classes("MATH 131", "09:30 am","M-W",true,81,R.drawable.math);
        Classes c5 = new Classes("SPAN 101", "14:00 am","M-W",true,81, R.drawable.spanish);

        sa.add(c1);
        sa.add(c2);
        sa.add(c3);
        sa.add(c4);
        sa.add(c5);

        RecyclerView classesList = findViewById(R.id.rv);
        classesList.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        classesList.setLayoutManager(lm);

        classesAdapter c = new classesAdapter(sa, MainActivity.this);
        classesList.setAdapter(c);
    }
}