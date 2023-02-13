package com.example.gpa_conleyj2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editview1 = findViewById(R.id.editTextTextPersonName1);
        EditText editview2 = findViewById(R.id.editTextTextPersonName2);
        EditText editview3 = findViewById(R.id.editTextTextPersonName3);
        EditText editview4 = findViewById(R.id.editTextTextPersonName4);
        EditText editview5 = findViewById(R.id.editTextTextPersonName5);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String grade1 = editview1.getText().toString();
                String grade2 = editview2.getText().toString();
                String grade3 = editview3.getText().toString();
                String grade4 = editview4.getText().toString();
                String grade5 = editview5.getText().toString();




            }
        });
    }
}