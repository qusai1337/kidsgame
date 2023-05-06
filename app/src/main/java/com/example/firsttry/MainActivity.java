package com.example.firsttry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        TextView resp = (TextView) findViewById(R.id.logo) ;

        Button button1 = (Button) findViewById(R.id.button3);
        Button button2 = (Button) findViewById(R.id.button4);
        Button button3 = (Button) findViewById(R.id.button5);
        Button next = (Button) findViewById(R.id.button6);

        TextView cong = (TextView) findViewById(R.id.editTextText4);


        TextView box = (TextView) findViewById(R.id.textView2);






        button.setOnClickListener(v -> {
            resp.setVisibility(View.INVISIBLE);
            button.setVisibility(View.GONE);
            box.setVisibility(View.VISIBLE);
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);


            button1.setBackgroundColor(getColor(R.color.blue));
            button2.setBackgroundColor(getColor(R.color.blue));
            button3.setBackgroundColor(getColor(R.color.blue));



        });

        button1.setOnClickListener(v -> button1.setBackgroundColor(getColor(R.color.google)));

        button2.setOnClickListener(v -> button2.setBackgroundColor(getColor(R.color.red)));

        button3.setOnClickListener(v -> button3.setBackgroundColor(getColor(R.color.red)));

        next.setOnClickListener(v -> {

            button1.setBackgroundColor(getColor(R.color.blue));
            button2.setBackgroundColor(getColor(R.color.blue));
            button3.setBackgroundColor(getColor(R.color.blue));


            box.setText("how many finger u have on your left hand?");
            button1.setText("10");
            button2.setText("5");
            button3.setText("15");


            button1.setOnClickListener(v1 -> button1.setBackgroundColor(getColor(R.color.red)));

            button2.setOnClickListener(v12 -> button2.setBackgroundColor(getColor(R.color.google)));

            button3.setOnClickListener(v13 -> button3.setBackgroundColor(getColor(R.color.red)));
            next.setOnClickListener(v14 -> {

                button1.setBackgroundColor(getColor(R.color.blue));
                button2.setBackgroundColor(getColor(R.color.blue));
                button3.setBackgroundColor(getColor(R.color.blue));


                box.setText("the sum of the two prev question is?");
                button1.setText("12");
                button2.setText("9");
                button3.setText("11");


                button1.setOnClickListener(v141 -> button1.setBackgroundColor(getColor(R.color.red)));

                button2.setOnClickListener(v1413 -> button2.setBackgroundColor(getColor(R.color.red)));

                button3.setOnClickListener(v1412 -> {
                    button3.setBackgroundColor(getColor(R.color.google));
                    next.setVisibility(View.INVISIBLE);
                    box.setVisibility(View.INVISIBLE);
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    cong.setVisibility(View.VISIBLE);


                });


            });

        });





    }
}