package com.example.cjrosas.mastermind_simulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {

    String name;

    EditText nameInput = (EditText) findViewById(R.id.nameInput);

    Button btn = (Button) findViewById(R.id.continueButton);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                String rules1 = getString(R.string.rules1);
                String rules2 = getString(R.string.rules2);
                TextView welcomeMessage = findViewById(R.id.welcomeMessage);
                welcomeMessage.setText(rules1 + name + rules2);
            }
        });
    }
}
