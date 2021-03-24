package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome_11181 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_11181);
    }

    public void clickLogin(View view){
        Intent i = new Intent(Welcome_11181.this, Login_11181.class);
        startActivity(i);
    }

    public void clickRegister(View view){
        Intent i = new Intent(Welcome_11181.this, Hal_Register.class);
        startActivity(i);
    }
}