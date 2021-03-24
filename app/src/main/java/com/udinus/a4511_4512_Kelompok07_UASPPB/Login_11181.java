package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login_11181 extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_11181);

        editTextEmail = findViewById(R.id.edt_txt_email);
        editTextPassword = findViewById(R.id.edt_txt_password);

    }

    public  void clickForgot(View view){
        Intent i = new Intent(Login_11181.this, ForgotPass_11181.class);
        startActivity(i);
    }

    public void postLogin(View view){
        //Validasi input email dan password kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())
        &&
            TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email dan Password Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
        }
        //Validasi Email Kosong
        else if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
        }
        //Validasi input tipe email
        else
            if(!isValidEmail(editTextEmail.getText().toString().trim())){
                Toast.makeText(view.getContext(), "Email Tidak Valid", Toast.LENGTH_LONG).show();
            }
            //Validasi password kosong
            else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
                Toast.makeText(view.getContext(), "Password Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(Login_11181.this, Menu_11181.class);
                startActivity(i);
            }
    }
    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}