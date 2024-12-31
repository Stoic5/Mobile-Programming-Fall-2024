package com.example.apptamrin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class showProFile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showprofile);

        TextView name=findViewById(R.id.name);
        TextView familly=findViewById(R.id.familly);
        TextView age=findViewById(R.id.age);
        Button nextPage=findViewById(R.id.btnNext);

        Intent dataIntent = getIntent();
        name.setText(dataIntent.getExtras().getString("name"));
        familly.setText(dataIntent.getExtras().getString("familly"));
        age.setText(dataIntent.getExtras().getString("age"));

        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent next=new Intent(showProFile.this,next.class);
                startActivity(next);
            }
        });
    }




}
