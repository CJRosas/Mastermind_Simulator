package com.example.cjrosas.mastermind_simulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {

    String name;

    EditText nameInput;

    Button btn;

    Button goOn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        nameInput = findViewById(R.id.nameInput);
        final CodeBreaker player = new CodeBreaker(name);
        btn = findViewById(R.id.submitButton);
        goOn = findViewById(R.id.continueButton);
        goOn.setVisibility(View.GONE);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                String rules1 = getString(R.string.rules1);
                String rules2 = getString(R.string.rules2);
                TextView welcomeMessage = findViewById(R.id.welcomeMessage);
                welcomeMessage.setText(rules1 .concat(" >".concat(name).concat(", ").concat(rules2)));
                goOn.setVisibility(View.VISIBLE);
            }
        });
        goOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(WelcomeScreen.this, GameView.class);
                mIntent.putExtra("player", player);
                startActivity(mIntent);
            }
        });
    }
}
