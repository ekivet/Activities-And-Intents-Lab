package com.example.erickivet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText fieldOne, fieldTwo, fieldThree, fieldFour, fieldFive, fieldSix;
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

        final List <EditText> userInput = new ArrayList<>();
        userInput.add(fieldOne);
        userInput.add(fieldTwo);
        userInput.add(fieldThree);
        userInput.add(fieldFour);
        userInput.add(fieldFive);
        userInput.add(fieldSix);

        submitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Boolean formComplete = true;

                for(EditText fieldValue : userInput){

                    if (fieldValue.getText().toString().length() == 0) {


                        fieldValue.setError("These Fields Mustn't Be Blank");

                        formComplete = false;
                    }
                    if (formComplete) {
                        Intent mainToResult = new Intent(MainActivity.this, ResultActivity.class);
                        mainToResult.putExtra("field_1", fieldOne.getText().toString().trim());
                        mainToResult.putExtra("field_2", fieldTwo.getText().toString().trim());
                        mainToResult.putExtra("field_3", fieldThree.getText().toString().trim());
                        mainToResult.putExtra("field_4", fieldFour.getText().toString().trim());
                        mainToResult.putExtra("field_5", fieldFive.getText().toString().trim());
                        mainToResult.putExtra("field_6", fieldSix.getText().toString().trim());

                        startActivity(mainToResult);
                    }


                }


            }
        });
    }
}
