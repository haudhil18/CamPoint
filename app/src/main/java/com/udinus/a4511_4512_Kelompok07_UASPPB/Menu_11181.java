package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_11181 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_11181);
    }

    public  void clickLeica(View view){
        Intent i = new Intent(Menu_11181.this, Leica_11181.class);
        startActivity(i);
    }

    public  void clickFuji(View view){
        Intent i = new Intent(Menu_11181.this, Fuji_11181.class);
        startActivity(i);
    }

    public  void clickSony(View view){
        Intent i = new Intent(Menu_11181.this, Sony_11181.class);
        startActivity(i);
    }

    public  void clickCanon(View view){
        Intent i = new Intent(Menu_11181.this, Canon_11181.class);
        startActivity(i);
    }

    public  void clickOlympus(View view){
        Intent i = new Intent(Menu_11181.this, Olympus_11181.class);
        startActivity(i);
    }

    public  void clickNikon(View view){
        Intent i = new Intent(Menu_11181.this, JualBeli.class);
        startActivity(i);
    }

    public  void clickImgLeica(View view){
        Intent i = new Intent(Menu_11181.this, Leica_11181.class);
        startActivity(i);
    }

    public  void clickImgFuji(View view){
        Intent i = new Intent(Menu_11181.this, Fuji_11181.class);
        startActivity(i);
    }

    public  void clickImgSony(View view){
        Intent i = new Intent(Menu_11181.this, Sony_11181.class);
        startActivity(i);
    }

    public  void clickImgCanon(View view){
        Intent i = new Intent(Menu_11181.this, Canon_11181.class);
        startActivity(i);
    }

    public  void clickImgOlympus(View view){
        Intent i = new Intent(Menu_11181.this, Olympus_11181.class);
        startActivity(i);
    }

    public  void clickImgNikon(View view){
        Intent i = new Intent(Menu_11181.this, JualBeli.class);
        startActivity(i);
    }

}