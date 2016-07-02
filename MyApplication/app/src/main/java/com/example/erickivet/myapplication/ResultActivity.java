package com.example.erickivet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;



public class ResultActivity extends AppCompatActivity {

    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView resultText;
        Intent mainToResult = getIntent();
        playAgainButton = (Button) findViewById(R.id.resultbutton);

        String field_1 = mainToResult.getStringExtra("field_1");
        String field_2 = mainToResult.getStringExtra("field_2");
        String field_3 = mainToResult.getStringExtra("field_3");
        String field_4 = mainToResult.getStringExtra("field_4");
        String field_5 = mainToResult.getStringExtra("field_5");
        String field_6 = mainToResult.getStringExtra("field_6");

        resultText = (TextView) findViewById(R.id.result);

        resultText.setText("New York City is a very " + field_1.toLowerCase() + " place.  Sometimes you see people " +
                "walking through central park wearing a(n) " + field_2.toLowerCase() + ".  There's alot to do there like " +
                "go to a " + field_3.toLowerCase() + " concert with your " + field_4.toLowerCase() + ".  It's nice to " +
                " walk your " + field_5.toLowerCase() + " through central park.  Afterwards you can grab a cup of coffee " +
                "and play " + field_6.toLowerCase() + ".");

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent resultToMain = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(resultToMain);

            }
        });
    }


}
