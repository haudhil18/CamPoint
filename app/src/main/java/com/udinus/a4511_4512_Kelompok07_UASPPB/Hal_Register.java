package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Hal_Register extends AppCompatActivity {

    //deklarasi edittext
    EditText editTextNama;
    EditText editTextEmail;
    EditText editTextPassword;
    Button postRegister;
    DatabaseReference reference;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal__register);

        // Binding EditText
        //editTextNama = findViewById(R.id.edt_txt_nama);
        //editTextEmail = findViewById(R.id.edt_txt_email);
        //editTextPassword = findViewById(R.id.edt_txt_password);

        editTextNama = (EditText)findViewById(R.id.edt_txt_nama);
        editTextEmail = (EditText)findViewById(R.id.edt_txt_email);
        editTextPassword = (EditText)findViewById(R.id.edt_txt_password);
        postRegister=(Button)findViewById(R.id.postRegister);
        user = new User();
        reference = FirebaseDatabase.getInstance().getReference().child("User");

        postRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setNama(editTextNama.getText().toString().trim());
                user.setEmail(editTextEmail.getText().toString().trim());
                user.setPassword(editTextPassword.getText().toString().trim());
                reference.push().setValue(user);
                Toast.makeText(Hal_Register.this,"Data Tersimpan",Toast.LENGTH_LONG).show();
                //Validasi Input Kosong
                if (TextUtils.isEmpty(editTextNama.getText().toString().trim())){
                    Toast.makeText(view.getContext(), "Nama Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
                    Toast.makeText(view.getContext(), "Email Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
                    Toast.makeText(view.getContext(), "Password Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if(!isValidEmail(editTextEmail.getText().toString().trim())) {
                    Toast.makeText(view.getContext(), "Email Tidak Valid", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent i = new Intent(Hal_Register.this, Login_11181.class);
                    startActivity(i);
                }
            }
        });
    }

    public void showMessage (String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    private boolean isValidEmail(String email) {
      return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}