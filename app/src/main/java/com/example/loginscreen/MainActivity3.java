package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button investButton;
    private Button buttonSupport;
    private Button callBrokerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        investButton = (Button) findViewById(R.id.invest);
        buttonSupport = (Button) findViewById(R.id.button8);
        callBrokerButton = (Button) findViewById(R.id.requestProfessional);


        investButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity4();
            }
        });

        buttonSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity5();
            }
        });

        callBrokerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity6();
            }
        });

    }

    public void openMainActivity6(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void openMainActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void openMainActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}