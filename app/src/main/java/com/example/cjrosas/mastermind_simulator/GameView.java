package com.example.cjrosas.mastermind_simulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.cjrosas.mastermind_simulator.CodeBreaker.checkCorrect;
import static com.example.cjrosas.mastermind_simulator.CodeBreaker.getAllCombinations;

public class GameView extends AppCompatActivity {

    String guess;

    //Submits the guess
    Button submitButton;

    //All of the guesses
    EditText guess1;
    EditText guess2;
    EditText guess3;
    EditText guess4;
    EditText guess5;
    EditText guess6;
    EditText guess7;
    EditText guess8;
    EditText guess9;
    EditText guess10;

    //All of the computer generated responses to the color guess
    TextView response1;
    TextView response2;
    TextView response3;
    TextView response4;
    TextView response5;
    TextView response6;
    TextView response7;
    TextView response8;
    TextView response9;
    TextView response10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_view);
        getAllCombinations();

        //Initialization of each item
        submitButton = (Button) findViewById(R.id.submitButton);
        guess1 = (EditText) findViewById(R.id.guess1);
        guess2 = (EditText) findViewById(R.id.guess2);
        guess3 = (EditText) findViewById(R.id.guess3);
        guess4 = (EditText) findViewById(R.id.guess4);
        guess5 = (EditText) findViewById(R.id.guess5);
        guess6 = (EditText) findViewById(R.id.guess6);
        guess7 = (EditText) findViewById(R.id.guess7);
        guess8 = (EditText) findViewById(R.id.guess8);
        guess9 = (EditText) findViewById(R.id.guess9);
        guess10 = (EditText) findViewById(R.id.guess10);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guess = guess1.getText().toString();
                response1.setText(checkCorrect(guess));
            }
        });
    }
}
