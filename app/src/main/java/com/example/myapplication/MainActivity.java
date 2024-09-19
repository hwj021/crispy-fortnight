package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView showValue;
    private Button buttonDisable;
    private Button buttonEnable;
    private int numer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);
        showValue = (TextView) findViewById(R.id.numer);

        showValue.setText(Integer.toString(numer));

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(false);
                numer++;
                showValue.setText(Integer.toString(numer));
            }
        });

        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(true);
            }
        });
    }
}