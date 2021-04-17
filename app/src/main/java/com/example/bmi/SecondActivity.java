package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Intent intent = getIntent();
        String r=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        TextView result=findViewById(R.id.result_txt);
        Toast.makeText(SecondActivity.this, r, Toast.LENGTH_SHORT).show();


    }
}