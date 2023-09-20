package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public void addFunction(View view){

    //data taken from the text inputOne
    EditText inputOne=(EditText)findViewById(R.id.inputOne);
    int a=Integer.parseInt(inputOne.getText().toString());

    //data taken from the text inputTwo
    EditText inputTwo=(EditText)findViewById(R.id.inputTwo);
    int b=Integer.parseInt(inputTwo.getText().toString());

    //make the calculation
    double c=a+b;

    //open result screen
    goToActivity(""+c);
    }

    public void subFunction(View view){

        //data taken from the text inputOne
        EditText inputOne=(EditText)findViewById(R.id.inputOne);
        int a=Integer.parseInt(inputOne.getText().toString());

        //data taken from the text inputTwo
        EditText inputTwo=(EditText)findViewById(R.id.inputTwo);
        int b=Integer.parseInt(inputTwo.getText().toString());

        //make the calculation
        double c=a-b;

        //open result screen
        goToActivity(""+c);
    }

    public void multFunction(View view){

        //data taken from the text inputOne
        EditText inputOne=(EditText)findViewById(R.id.inputOne);
        int a=Integer.parseInt(inputOne.getText().toString());

        //data taken from the text inputTwo
        EditText inputTwo=(EditText)findViewById(R.id.inputTwo);
        int b=Integer.parseInt(inputTwo.getText().toString());

        //make the calculation
        double c=a*b;

        //open result screen
        goToActivity(""+c);
    }

    public void divFunction(View view){

        //data taken from the text inputOne
        EditText inputOne=(EditText)findViewById(R.id.inputOne);
        int a=Integer.parseInt(inputOne.getText().toString());

        //data taken from the text inputTwo
        EditText inputTwo=(EditText)findViewById(R.id.inputTwo);
        int b=Integer.parseInt(inputTwo.getText().toString());

        if(b==0){
            //add message to the main activity screen
            Toast.makeText(MainActivity.this,"Error:Dividing by Zero",Toast.LENGTH_LONG).show();

        }else{
            //make the calculation
            double c=a/b;

            //open result screen
            goToActivity(""+c);
        }
    }

    public void goToActivity(String s){
        Intent intent=new Intent(this,ResultActivity.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
