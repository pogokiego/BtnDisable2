package com.example.buttondisableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonoff;
    private Button buttonon;
    private TextView count;
    private int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonoff = findViewById(R.id.buttonDisable);
        buttonon = findViewById(R.id.buttonEnable);
        count = findViewById(R.id.licznik);


        buttonoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicks++;


                buttonDisable.setEnabled(false);


                count.setText("Ilość kliknięć: " + clicks);


                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });


        buttonon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonoff.setEnabled(true);


                Toast.makeText(MainActivity.this, "Przycisk został ponownie włączony", Toast.LENGTH_SHORT).show();
            }
        });
    }
}