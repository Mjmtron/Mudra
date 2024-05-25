package com.example.MUDRA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import org.opencv.android.OpenCVLoader;


public class MainActivity extends AppCompatActivity {
    static {
        if(OpenCVLoader.initDebug()){
            Log.d("MainActivity: ","Opencv is loaded");
        }
        else {
            Log.d("MainActivity: ","Opencv failed to load");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button camera_button = findViewById(R.id.camera_button);
        camera_button.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,CameraActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)));

        Button dictionary = findViewById(R.id.dictionary);
        dictionary.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,dictionary.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)));

        Button english = findViewById(R.id.english);
        english.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,english.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)));

        Button hindi = findViewById(R.id.hindi);
        hindi.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,hindi.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)));

        Button kannada = findViewById(R.id.kannada);
        kannada.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,kannada.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)));



    }
}