package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity01 extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, deskripsi, harga;

    String data1, data2, data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second01);

        mainImageView   = findViewById(R.id.imgdeskripsi01);
        title           = findViewById(R.id.title01);
        deskripsi       = findViewById(R.id.deskripsi01);
        harga           = findViewById(R.id.harga01);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2") && getIntent().hasExtra("data3")){
            data1   = getIntent().getStringExtra("data1");
            data2   = getIntent().getStringExtra("data2");
            data3   = getIntent().getStringExtra("data3");
            myImage = getIntent().getIntExtra("myImage",1);

        }else{
            Toast.makeText(this, "Tidak Ada Data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        title.setText(data1);
        deskripsi.setText(data2);
        harga.setText(data3);
        mainImageView.setImageResource(myImage);
    }
}