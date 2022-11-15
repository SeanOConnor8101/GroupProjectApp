package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    private Button directlyButton;
    private Button viaBrokerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        directlyButton = (Button) findViewById(R.id.button10);
        viaBrokerButton = (Button) findViewById(R.id.button11);

        directlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity4();
            }
        });

        viaBrokerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity9();
            }
        });
    }

    public void openMainActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openMainActivity9(){
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }

}