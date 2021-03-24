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

public class DialogForm extends DialogFragment {
    String namakam, konkam,deskam, key;
    DataJual dataJual;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DataJual");

    public DialogForm(String namakam, String konkam, String deskam, String key) {
        this.namakam = namakam;
        this.konkam = konkam;
        this.deskam = deskam;
        this.key = key;
    }
    TextView et_namakam;
    TextView et_konkam;
    TextView et_deskam;

    Button btn_jual;

    @com.google.firebase.database.annotations.Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @com.google.firebase.database.annotations.Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.input_form, container, false);

        et_namakam = view.findViewById(R.id.et_namakam);
        et_konkam = view.findViewById(R.id.et_konkam);
        et_deskam = view.findViewById(R.id.et_deskam);
        btn_jual = view.findViewById(R.id.btn_jual);



        btn_jual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String namakam = et_namakam.getText().toString();
                String konkam = et_konkam.getText().toString();
                String deskam = et_deskam.getText().toString();
                myRef.child("DataJual").push().setValue(new DataJual(namakam,konkam,deskam)).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        myRef.push().setValue(dataJual);
                        Toast.makeText(view.getContext(), "Data tersimpan", Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });

        return view;

    }
}
