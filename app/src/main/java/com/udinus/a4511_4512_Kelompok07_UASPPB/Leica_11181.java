package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Leica_11181 extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[];
    int images[] = {
            R.drawable.leicam10safari,
            R.drawable.leica19116dlux7,
            R.drawable.leicam10rdigitalrangefinder,
            R.drawable.leicammono,
            R.drawable.leicaq2,
            R.drawable.leicaqp,
            R.drawable.leicam10silver,
            R.drawable.leicam10black,
            R.drawable.leicasl2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leica_11181);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.namakamera01);
        s2 = getResources().getStringArray(R.array.deskripsi01);
        s3 = getResources().getStringArray(R.array.harga01);

        MyAdapter01 myAdapter = new MyAdapter01(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}