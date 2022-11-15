package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button stockName1;
    private Button stockName2;
    private Button stockName3;
    private Button stockName4;
    private Button stockName5;
    private Button cryptoName1;
    private Button cryptoName2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        stockName1 = (Button) findViewById(R.id.button);
        stockName2 = (Button) findViewById(R.id.button2);
        stockName3 = (Button) findViewById(R.id.button3);
        stockName4 = (Button) findViewById(R.id.button4);
        stockName5 = (Button) findViewById(R.id.button5);
        cryptoName1 = (Button) findViewById(R.id.button6);
        cryptoName2 = (Button) findViewById(R.id.button7);


        stockName1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });

        stockName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });

        stockName3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });

        stockName4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });

        stockName5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });

        cryptoName1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });

        cryptoName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity7();
            }
        });
    }

    public void openMainActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}