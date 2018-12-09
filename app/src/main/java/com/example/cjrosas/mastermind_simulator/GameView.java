package com.example.cjrosas.mastermind_simulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameView extends AppCompatActivity {
    private TextView high_Score;
    private TextView highScore_Name;
    private TextView highScore_num;
    private CodeBreaker highScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_view);

        high_Score = (TextView) findViewById(R.id.highscore);
        highScore_Name = (TextView) findViewById(R.id.highscore_name);
        highScore_num = (TextView) findViewById(R.id.highscore_number);
    }
}
