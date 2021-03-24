package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Fuji_11181 extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[], s3[];
    int images[] = {
            R.drawable.fujix100f,
            R.drawable.fujixt4,
            R.drawable.fuji_mirrorless_x_h1,
            R.drawable.fujigfx50r,
            R.drawable.fujixs10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuji_11181);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.namakamera02);
        s2 = getResources().getStringArray(R.array.deskripsi02);
        s3 = getResources().getStringArray(R.array.harga02);

        MyAdapter02 myAdapter = new MyAdapter02(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}