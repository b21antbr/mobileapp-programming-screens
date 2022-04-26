package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("name", "Anton");
        startActivity(intent);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            // Do something with the name and number
        }
    }
}
