package com.secondassignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText etnumber,etWords;
    Button btnCon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnumber = findViewById(R.id.etnumber);
        etWords = findViewById(R.id.etWords);
        btnCon = findViewById(R.id.btnCon);

        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num;
                num = Integer.parseInt(etnumber.getText().toString());

                NumbertoWords numbertoWords = new NumbertoWords(num);
                etWords.setText(numbertoWords.NumbertoWord());


            }
        });
    }
}

