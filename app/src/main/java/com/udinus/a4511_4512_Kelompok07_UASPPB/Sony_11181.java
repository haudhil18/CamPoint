package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Sony_11181 extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[], s3[];
    int images[] = {
            R.drawable.sonya7r3,
            R.drawable.sonya7smark11,
            R.drawable.sonya6100kit1650mm,
            R.drawable.sonya6600kite18135mm,
            R.drawable.sonydscwx500

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sony_11181);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.namakamera03);
        s2 = getResources().getStringArray(R.array.deskripsi03);
        s3 = getResources().getStringArray(R.array.harga03);

        MyAdapter03 myAdapter = new MyAdapter03(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}