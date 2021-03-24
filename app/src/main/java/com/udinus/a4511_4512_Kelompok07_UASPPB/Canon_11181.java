package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Canon_11181 extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[], s3[];
    int images[] = {
            R.drawable.canoneosm6,
            R.drawable.canoneos6dmarkiikitef2470mm,
            R.drawable.canoneos90dkit18135mmisusm,
            R.drawable.canoneosr5kit24105mm,
            R.drawable.canonpowershotg7xmarkii
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canon_11181);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.namakamera04);
        s2 = getResources().getStringArray(R.array.deskripsi04);
        s3 = getResources().getStringArray(R.array.harga04);

        MyAdapter04 myAdapter = new MyAdapter04(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}