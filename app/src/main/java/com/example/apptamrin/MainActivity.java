    package com.example.apptamrin;

    import android.content.Intent;
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
            setContentView(R.layout.activity_main);

            EditText edtName = findViewById(R.id.edtName);
            EditText edtFamilly = findViewById(R.id.edtFamilly);
            EditText edtAge = findViewById(R.id.edtAge);
            Button btnAdd = findViewById(R.id.btnAdd);


            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent moveintent=new Intent(MainActivity.this, showProFile.class);
                    moveintent.putExtra("name",edtName.getText().toString());
                    moveintent.putExtra("familly",edtFamilly.getText().toString());
                    moveintent.putExtra("age",edtAge.getText().toString());
                    startActivity(moveintent);


                }
            });
        }
    }