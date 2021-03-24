package com.udinus.a4511_4512_Kelompok07_UASPPB;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter04 extends RecyclerView.Adapter<MyAdapter04.MyViewHolder> {

    String data1[], data2[], data3[];
    int images[];
    Context context;

    public MyAdapter04(Context ct, String[] s1, String[] s2, String[] s3, int[] img) {
        context = ct;
        data1   = s1;
        data2   = s2;
        data3   = s3;
        images  = img;

    }

    @NonNull
    @Override
    public MyAdapter04.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row04, parent, false);
        return new MyAdapter04.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter04.MyViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myImage.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SecondActivity04.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("data3", data3[position]);
                intent.putExtra("myImage", images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return images.length; }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1;
        ImageView myImage;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1     = itemView.findViewById(R.id.myText1);
            myImage     = itemView.findViewById(R.id.myImageView);
            mainLayout  = itemView.findViewById(R.id.mainLayout);
        }
    }
}
