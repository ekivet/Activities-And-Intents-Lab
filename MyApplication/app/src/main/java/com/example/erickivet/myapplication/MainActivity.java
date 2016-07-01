package com.example.erickivet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText fieldOne, fieldTwo, fieldThree,fieldFour,fieldFive,fieldSix;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fieldOne = (EditText) findViewById(R.id.field1);
        fieldTwo = (EditText) findViewById(R.id.field2);
        fieldThree = (EditText) findViewById(R.id.field3);
        fieldFour = (EditText) findViewById(R.id.field4);
        fieldFive = (EditText) findViewById(R.id.field5);
        fieldSix = (EditText) findViewById(R.id.field6);
        submitButton = (Button) findViewById(R.id.submit);
    }
}
