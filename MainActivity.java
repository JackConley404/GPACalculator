package com.example.gpa_conleyj2_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView GPALabel = findViewById(R.id.gpaLabel);
        EditText editview1 = findViewById(R.id.editTextTextPersonName1);
        EditText editview2 = findViewById(R.id.editTextTextPersonName2);
        EditText editview3 = findViewById(R.id.editTextTextPersonName3);
        EditText editview4 = findViewById(R.id.editTextTextPersonName4);
        EditText editview5 = findViewById(R.id.editTextTextPersonName5);
        Button button = findViewById(R.id.button);

        Context context = getApplicationContext();
        CharSequence text = "Error! one of the fields has not been filled!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editview1.length() == 0 || editview2.length() == 0 || editview3.length() == 0 || editview4.length() == 0 || editview5.length() == 0){
                    toast.show();
                }

                else {

                    LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);

                    int grade1 = Integer.parseInt(editview1.getText().toString());
                    int grade2 = Integer.parseInt(editview2.getText().toString());
                    int grade3 = Integer.parseInt(editview3.getText().toString());
                    int grade4 = Integer.parseInt(editview4.getText().toString());
                    int grade5 = Integer.parseInt(editview5.getText().toString());

                    int gpa = ((grade1 + grade2 + grade3 + grade4 + grade5) / 5);
                    GPALabel.setText("GPA: " + gpa);


                    if (gpa < 60) {
                        linearLayout.setBackgroundColor(Color.parseColor("#EF423D"));
                    } else if (gpa >= 61 && gpa <= 79) {
                        linearLayout.setBackgroundColor(Color.parseColor("#FFD801"));
                    } else {
                        linearLayout.setBackgroundColor(Color.parseColor("#169E29"));
                    }
                }
            }
        });
    }
}