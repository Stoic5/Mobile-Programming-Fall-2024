package com.example.apptamrin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        setContentView(R.layout.activity_main);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtFamilly = findViewById(R.id.edtFamilly);
        EditText edtAge = findViewById(R.id.edtAge);
        TextView txtName = findViewById(R.id.txtName);
        TextView txtFamilly = findViewById(R.id.txtFamlly);
        TextView txtAge = findViewById(R.id.txtAge);
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtName.setText(edtName.getText().toString());
                txtFamilly.setText(edtFamilly.getText().toString());
                txtAge.setText(edtAge.getText().toString());
            }
        });


    }
}