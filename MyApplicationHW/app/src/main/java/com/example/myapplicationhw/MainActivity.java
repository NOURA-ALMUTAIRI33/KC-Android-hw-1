package com.example.myapplicationhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Tv1 = findViewById(R.id.Tv1);
        TextView Tv2 = findViewById(R.id.Tv2);
        TextView r = findViewById(R.id.r);
        EditText Ed1 = findViewById(R.id.Ed1);
        EditText Ed2 = findViewById(R.id.Ed2);
        EditText Ed3 = findViewById(R.id.Ed3);
        EditText Ed4 = findViewById(R.id.Ed4);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int num3 = Integer.parseInt(Ed3.getText().toString());
                int num4 =Integer.parseInt(Ed4.getText().toString());

                int r = num1 + num2 + num3 + num4;


                Tv2.setText(String.valueOf(r));

            }
        });


        }






    }





