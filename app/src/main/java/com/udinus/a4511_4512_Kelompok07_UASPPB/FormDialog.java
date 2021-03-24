package com.udinus.a4511_4512_Kelompok07_UASPPB;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.annotations.Nullable;

public class FormDialog extends DialogFragment {
    String nama, alamat, jenis, key;
    DataBeli dataBeli;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DataBeli");

    public FormDialog(String nama, String alamat, String jenis, String key) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenis = jenis;
        this.key = key;

    }

    TextView et_nama;
    TextView et_alamat;
    TextView et_jenis;

    Button btn_beli;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.input_form1, container, false);

        et_nama = view.findViewById(R.id.et_nama);
        et_alamat = view.findViewById(R.id.et_alamat);
        et_jenis = view.findViewById(R.id.et_jenis);
        btn_beli = view.findViewById(R.id.btn_beli);



        btn_beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String nama = et_nama.getText().toString();
                String alamat = et_alamat.getText().toString();
                String jenis = et_jenis.getText().toString();
                myRef.child("DataBeli").push().setValue(new DataBeli(nama, alamat, jenis)).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        myRef.push().setValue(dataBeli);
                        Toast.makeText(view.getContext(), "Data tersimpan", Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });

        return view;

    }
}
