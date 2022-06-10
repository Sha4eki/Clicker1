package com.example.clicker1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private int Counter = 0;
        Button btnp;
        Button btnm;
        TextView txv;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            setContentView(R.layout.activity_main);


            btnp = (Button) findViewById(R.id.button);
            btnm = (Button) findViewById(R.id.button2);
            txv = (TextView) findViewById(R.id.tx);
            TextView textElement = (TextView) findViewById(R.id.tx);
            textElement.setTextColor(Color.GREEN);

            btnp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Counter++;
                    txv.setText(Integer.toString(Counter));
                    TextView textElement = (TextView) findViewById(R.id.tx);
                    if ((Counter % 2) == 0) {
                        textElement.setTextColor(Color.GREEN); //this is green color
                    }
                    else {
                        textElement.setTextColor(Color.RED); //this is red color
                    }
                }
            });

            btnm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View vew) {
                    if (Counter > 0) {
                        Counter--;
                        txv.setText(Integer.toString(Counter));
                        TextView textElement = (TextView) findViewById(R.id.tx);
                        if ((Counter % 2) == 0) {
                            textElement.setTextColor(Color.GREEN); //this is green color
                        }
                        else {
                            textElement.setTextColor(Color.RED); //this is red color
                        }
                    }
                }
            });
        }
    }