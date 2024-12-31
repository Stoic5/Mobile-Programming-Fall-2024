package com.example.apptamrin;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class next extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleitems);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {

            userList.add(new User("Alice" + i));
            userList.add(new User("Bob"));
            userList.add(new User("Charlie"));
        }





        AdapterUser adapter = new AdapterUser(userList);
        recyclerView.setAdapter(adapter);
    }
}
