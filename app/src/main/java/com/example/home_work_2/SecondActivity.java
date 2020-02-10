package com.example.home_work_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getAnswer();
    }

    public void openCalc(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivityForResult(intent,56);
    }


    public void getAnswer(){
        String  bbb= getIntent().getStringExtra("key");
        TextView textView = findViewById(R.id.text_view);
        textView.setText(bbb);
    }
}
