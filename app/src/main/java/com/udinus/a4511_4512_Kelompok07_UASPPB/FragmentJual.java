package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FragmentJual extends AppCompatActivity {

    FloatingActionButton fab_add;
    RecyclerAdapter recyclerAdapter;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DataJual");
    List<DataJual> list = new ArrayList<>();
    RecyclerView rv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_jual);

        fab_add = findViewById(R.id.fab_add);
        rv_view = findViewById(R.id.rv_view);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        rv_view.setLayoutManager(mLayout);


        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogForm dialogFrom = new DialogForm("","","","");
                dialogFrom.show(getSupportFragmentManager(), "form");

            }
        });

        showData();

    }

    private void showData(){
        myRef.child("DataJual").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                list = new ArrayList<>();
                for(DataSnapshot item : snapshot.getChildren()){
                    DataJual jl = item.getValue(DataJual.class);
                    jl.setKey(item.getKey());
                    list.add(jl);
                }

                recyclerAdapter = new RecyclerAdapter(list, FragmentJual.this);
                rv_view.setAdapter(recyclerAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}