package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        textView=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("result");
        textView.setText(str);

    }

    public void returnToMainActivity(String s){
        Intent intentMain=new Intent(this,MainActivity.class);
        startActivity(intentMain);
    }
}