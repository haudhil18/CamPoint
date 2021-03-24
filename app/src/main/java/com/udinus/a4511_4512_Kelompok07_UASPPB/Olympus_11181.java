package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Olympus_11181 extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[], s3[];
    int images[] = {
            R.drawable.olympuspenfbody,
            R.drawable.olympusem1mark3,
            R.drawable.olympusomdem10mark2kit,
            R.drawable.olympusomdem10mark3kit,
            R.drawable.olympuspenfkitmzuiko
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olympus_11181);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.namakamera05);
        s2 = getResources().getStringArray(R.array.deskripsi05);
        s3 = getResources().getStringArray(R.array.harga05);

        MyAdapter05 myAdapter = new MyAdapter05(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}