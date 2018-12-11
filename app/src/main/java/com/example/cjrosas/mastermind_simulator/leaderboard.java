package com.example.cjrosas.mastermind_simulator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class leaderboard extends AppCompatActivity {

    public TextView textView;
    private String playerone, playertwo, playerthree, playerfour, playerfive, playersix,
            playerseven, playereight, playernine, playerten;
    private int playerone_score, playertwo_score, playerthree_score, playerfour_score,
            playerfive_score, playersix_score, playerseven_score, playereight_score,
            playernine_score, playerten_score;

    public TextView player_one, player_two, player_three, player_four, player_five, player_six,
            player_seven, player_eight, player_nine, player_ten;
    public TextView player_one_score, player_two_score, player_three_score, player_four_score,
            player_five_score, player_six_score, player_seven_score, player_eight_score,
            player_nine_score, player_ten_score;

    public String nameone, nametwo, namethree, namefour, namefive, namesix, nameseven, nameeight,
            namenine, nameten;
    public int scoreone, scoretwo, scorethree, scorefour, scorefive, scoresix, scoreseven, scoreeight,
            scorenine, scoreten;
    public static final String SHARED_PREFS = "sharedPrefs";
    public String text = "Leaderboard";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        textView = findViewById(R.id.textview);
        textView.setText(text);
        player_one = findViewById(R.id.playerone);
        player_two = findViewById(R.id.playertwo);
        player_three = findViewById(R.id.playerthree);
        player_four = findViewById(R.id.playerfour);
        player_five = findViewById(R.id.playerfive);
        player_six = findViewById(R.id.playersix);
        player_seven = findViewById(R.id.playerseven);
        player_eight = findViewById(R.id.playereight);
        player_nine = findViewById(R.id.playernine);
        player_ten = findViewById(R.id.playerten);
        player_one_score = findViewById(R.id.playerone_score);
        player_two_score = findViewById(R.id.playertwo_score);
        player_three_score = findViewById(R.id.playerthree_score);
        player_four_score = findViewById(R.id.playerfour_score);
        player_five_score = findViewById(R.id.playerfive_score);
        player_six_score = findViewById(R.id.playersix_score);
        player_seven_score = findViewById(R.id.playerseven_score);
        player_eight_score = findViewById(R.id.playereight_score);
        player_nine_score = findViewById(R.id.playernine_score);
        player_ten_score = findViewById(R.id.playerten_score);

        loadData();
        updateViews();
    }
    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value;
        int numOfTurns = CodeBreaker.getNumOfTurns();
        nameone = sharedPreferences.getString("one", "No one has won yet");
        scoreone = sharedPreferences.getInt("one_score", 0);
        namethree = sharedPreferences.getString("three", "No one has won yet");
        scorethree = sharedPreferences.getInt("three_score", 0);
        nametwo = sharedPreferences.getString("two", "No one has won yet");
        scoretwo = sharedPreferences.getInt("two_score", 0);
        namefour = sharedPreferences.getString("four", "No one has won yet");
        scorefour = sharedPreferences.getInt("four_score", 0);
        namefive = sharedPreferences.getString("five", "No one has won yet");
        scorefive = sharedPreferences.getInt("five_score", 0);
        namesix = sharedPreferences.getString("six", "No one has won yet");
        scoresix = sharedPreferences.getInt("six_score", 0);
        nameseven = sharedPreferences.getString("seven", "No one has won yet");
        scoreseven = sharedPreferences.getInt("seven_score", 0);
        nameeight = sharedPreferences.getString("eight", "No one has won yet");
        scoreeight = sharedPreferences.getInt("eight_score", 0);
        namenine = sharedPreferences.getString("nine", "No one has won yet");
        scorenine = sharedPreferences.getInt("nine_score", 0);
        nameten = sharedPreferences.getString("ten", "No one has won yet");
        scoreten = sharedPreferences.getInt("ten_score", 0);
        value = sharedPreferences.getInt("one_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("one", CodeBreaker.getName());
            editor.putInt("one_score", CodeBreaker.getNumOfTurns());
            editor.putString("two", nameone);
            editor.putInt("two_score", scoreone);
            editor.putString("three", nametwo);
            editor.putInt("three_score", scoretwo);
            editor.putString("four", namethree);
            editor.putInt("four_score", scorethree);
            editor.putString("five", namefour);
            editor.putInt("five_score", scorefour);
            editor.putString("six", namefive);
            editor.putInt("six_score", scorefive);
            editor.putString("seven", namesix);
            editor.putInt("seven_score", scoresix);
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);


        }
        value = sharedPreferences.getInt("two_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("two", CodeBreaker.getName());
            editor.putInt("two_score", CodeBreaker.getNumOfTurns());
            editor.putString("three", nametwo);
            editor.putInt("three_score", scoretwo);
            editor.putString("four", namethree);
            editor.putInt("four_score", scorethree);
            editor.putString("five", namefour);
            editor.putInt("five_score", scorefour);
            editor.putString("six", namefive);
            editor.putInt("six_score", scorefive);
            editor.putString("seven", namesix);
            editor.putInt("seven_score", scoresix);
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("three_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("three", CodeBreaker.getName());
            editor.putInt("three_score", CodeBreaker.getNumOfTurns());
            editor.putString("four", namethree);
            editor.putInt("four_score", scorethree);
            editor.putString("five", namefour);
            editor.putInt("five_score", scorefour);
            editor.putString("six", namefive);
            editor.putInt("six_score", scorefive);
            editor.putString("seven", namesix);
            editor.putInt("seven_score", scoresix);
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("four_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("four", CodeBreaker.getName());
            editor.putInt("four_score", CodeBreaker.getNumOfTurns());
            editor.putString("five", namefour);
            editor.putInt("five_score", scorefour);
            editor.putString("six", namefive);
            editor.putInt("six_score", scorefive);
            editor.putString("seven", namesix);
            editor.putInt("seven_score", scoresix);
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("five_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("five", CodeBreaker.getName());
            editor.putInt("five_score", CodeBreaker.getNumOfTurns());
            editor.putString("six", namefive);
            editor.putInt("six_score", scorefive);
            editor.putString("seven", namesix);
            editor.putInt("seven_score", scoresix);
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("six_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("six", CodeBreaker.getName());
            editor.putInt("six_score", CodeBreaker.getNumOfTurns());
            editor.putString("seven", namesix);
            editor.putInt("seven_score", scoresix);
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("seven_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("seven", CodeBreaker.getName());
            editor.putInt("seven_score", CodeBreaker.getNumOfTurns());
            editor.putString("eight", nameseven);
            editor.putInt("eight_score", scoreseven);
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("eight_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("eight", CodeBreaker.getName());
            editor.putInt("eight_score", CodeBreaker.getNumOfTurns());
            editor.putString("nine", nameeight);
            editor.putInt("nine_score", scoreeight);
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("nine_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("nine", CodeBreaker.getName());
            editor.putInt("nine_score", CodeBreaker.getNumOfTurns());
            editor.putString("ten", namenine);
            editor.putInt("ten_score", scorenine);
        }
        value = sharedPreferences.getInt("ten_score", 0);
        if (value < numOfTurns || value == 0) {
            editor.putString("ten", CodeBreaker.getName());
            editor.putInt("ten_score", CodeBreaker.getNumOfTurns());
        }
        editor.apply();
        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
    }
    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        playerone = sharedPreferences.getString("one", "No one has won yet");
        playerone_score = sharedPreferences.getInt("one_score", 0);
        playertwo = sharedPreferences.getString("two", "No one has won yet");
        playertwo_score = sharedPreferences.getInt("two_score", 0);
        playerthree = sharedPreferences.getString("three", "No one has won yet");
        playerthree_score = sharedPreferences.getInt("three_score", 0);
        playerfour = sharedPreferences.getString("four", "No one has won yet");
        playerfour_score = sharedPreferences.getInt("four_score", 0);
        playerfive = sharedPreferences.getString("five", "No one has won yet");
        playerfive_score = sharedPreferences.getInt("five_score", 0);
        playersix = sharedPreferences.getString("six", "No one has won yet");
        playersix_score = sharedPreferences.getInt("six_score", 0);
        playerseven = sharedPreferences.getString("seven", "No one has won yet");
        playerseven_score = sharedPreferences.getInt("seven_score", 0);
        playereight = sharedPreferences.getString("eight", "No one has won yet");
        playereight_score = sharedPreferences.getInt("eight_score", 0);
        playernine = sharedPreferences.getString("nine", "No one has won yet");
        playernine_score = sharedPreferences.getInt("nine_score", 0);
        playerten = sharedPreferences.getString("ten", "No one has won yet");
        playerten_score = sharedPreferences.getInt("ten_score", 0);
    }

    public void updateViews() {
        saveData();
        player_one.setText(playerone);
        player_one_score.setText(Integer.toString(playerone_score));
        player_two.setText(playertwo);
        player_two_score.setText(Integer.toString(playertwo_score));
        player_three.setText(playerthree);
        player_three_score.setText(Integer.toString(playerthree_score));
        player_four.setText(playerfour);
        player_four_score.setText(Integer.toString(playerfour_score));
        player_five.setText(playerfive);
        player_five_score.setText(Integer.toString(playerfive_score));
        player_six.setText(playersix);
        player_six_score.setText(Integer.toString(playersix_score));
        player_seven.setText(playerseven);
        player_seven_score.setText(Integer.toString(playerseven_score));
        player_eight.setText(playereight);
        player_eight_score.setText(Integer.toString(playereight_score));
        player_nine.setText(playernine);
        player_nine_score.setText(Integer.toString(playernine_score));
        player_ten.setText(playerten);
        player_ten_score.setText(Integer.toString(playerten_score));
    }
}
