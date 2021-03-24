package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPass_11181 extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextCode;
    EditText editTextnewPassword;
    EditText editTextconfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass_11181);

        // Binding EditText
        editTextCode = findViewById(R.id.edt_txt_code);
        editTextnewPassword = findViewById(R.id.edt_new_password);
        editTextconfirmPassword = findViewById(R.id.edt_confirm_password);
    }
    public void postChangePassword(View view) {
        // Validasi kosong
        if (TextUtils.isEmpty(editTextCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Code Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        if (TextUtils.isEmpty(editTextnewPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "New Password Harus di Isi",Toast.LENGTH_LONG).show();
        }
        if (TextUtils.isEmpty(editTextconfirmPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Confirm Password Harus di Isi", Toast.LENGTH_LONG).show();
        }
        else
        if (!TextUtils.isDigitsOnly(editTextCode.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Hanya Menerima Inputan Angka", Toast.LENGTH_LONG).show();
        }
        else if (!TextUtils.equals(editTextconfirmPassword.getText().toString().trim(),editTextnewPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "New Password dan Confirm Password Tidak Cocok", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(ResetPass_11181.this, Welcome_11181.class);
            startActivity(i);
        }
    }
}