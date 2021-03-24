package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JualBeli extends AppCompatActivity {

    Button FragmentJual, FragmentBeli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual_beli);
        FragmentJual = (Button) findViewById(R.id.FragmentJual);
        FragmentBeli = (Button) findViewById(R.id.FragmentBeli);

        FragmentJual.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent i = new Intent(JualBeli.this, FragmentJual.class);
                startActivity(i);
            }
        });
        FragmentBeli.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent i = new Intent(JualBeli.this, FragmentBeli.class);
                startActivity(i);
            }
        });
    }
}