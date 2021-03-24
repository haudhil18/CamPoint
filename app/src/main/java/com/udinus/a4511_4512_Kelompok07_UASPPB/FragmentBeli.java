package com.udinus.a4511_4512_Kelompok07_UASPPB;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class FragmentBeli extends AppCompatActivity {

    FloatingActionButton fab_add;
    RecyclerAdapter1 recyclerAdapter;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("DataBeli");
    List<DataBeli> list = new ArrayList<>();
    RecyclerView rv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_beli);

        fab_add = findViewById(R.id.fab_add);
        rv_view = findViewById(R.id.rv_view);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        rv_view.setLayoutManager(mLayout);

        fab_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FormDialog formDialog = new FormDialog("","","","");
                formDialog.show(getSupportFragmentManager(), "form");

            }
        });

        showData();
    }
    private void showData(){
        myRef.child("DataBeli").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                list = new ArrayList<>();
                for(DataSnapshot item : snapshot.getChildren()){
                    DataBeli bl = item.getValue(DataBeli.class);
                    bl.setKey(item.getKey());
                    list.add(bl);
                }

                recyclerAdapter = new RecyclerAdapter1(list, FragmentBeli.this);
                rv_view.setAdapter(recyclerAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}