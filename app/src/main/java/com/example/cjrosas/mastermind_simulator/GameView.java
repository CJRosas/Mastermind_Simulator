package com.example.cjrosas.mastermind_simulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GameView extends AppCompatActivity {
//    public static void restartActivity(Activity act){
//        Intent intent=new Intent();
//        intent.setClass(act, act.getClass());
//        ((Activity)act).startActivity(intent);
//        ((Activity)act).finish();
//    }
//    public static class FireMissilesDialogFragment extends DialogFragment {
//        @Override
//        public Dialog onCreateDialog(Bundle savedInstanceState) {
//            // Use the Builder class for convenient dialog construction
//            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//            builder.setMessage(R.string.end_game)
//                    .setPositiveButton(R.string.Reset, new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int id) {
//                            System.exit(0);
//                            //Figure out how to do that
//                        }
//                    })
//                    .setNegativeButton(R.string.Exit, new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int id) {
//                        }
//                    });
//            // Create the AlertDialog object and return it
//            return builder.create();
//        }
//    }
    int i = 0;

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
    TextView turnCounter;
    final CodeBreaker player = (CodeBreaker) getIntent().getSerializableExtra("player");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_view);
        String text = "Turns: ";
        final TextView turnCounter = findViewById(R.id.turnCounter);
        turnCounter.setText(text.concat(Integer.toString(player.getNumOfTurns())));

        //Initialization of each item
        submitButton = findViewById(R.id.submitButton);
        guess1 = findViewById(R.id.guess1);
        guess2 = findViewById(R.id.guess2);
        guess3 = findViewById(R.id.guess3);
        guess4 = findViewById(R.id.guess4);
        guess5 = findViewById(R.id.guess5);
        guess6 = findViewById(R.id.guess6);
        guess7 = findViewById(R.id.guess7);
        guess8 = findViewById(R.id.guess8);
        guess9 = findViewById(R.id.guess9);
        guess10 =  findViewById(R.id.guess10);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    guess = guess1.getText().toString();
                    TextView response1 = findViewById(R.id.response1);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response1.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 1) {
                    guess = guess2.getText().toString();
                    TextView response2 = findViewById(R.id.response2);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response2.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 2) {
                    guess = guess3.getText().toString();
                    TextView response3 = findViewById(R.id.response3);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response3.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                    }
                }
                if (i == 3) {
                    guess = guess4.getText().toString();
                    TextView response4 = findViewById(R.id.response4);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response4.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                    }
                }
                if (i == 4) {
                    guess = guess5.getText().toString();
                    TextView response5 = findViewById(R.id.response5);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response5.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 5) {
                    guess = guess6.getText().toString();
                    TextView response6 = findViewById(R.id.response6);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response6.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 6) {
                    guess = guess7.getText().toString();
                    TextView response7 = findViewById(R.id.response7);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response7.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 7) {
                    guess = guess8.getText().toString();
                    TextView response8 = findViewById(R.id.response8);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response8.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 8) {
                    guess = guess9.getText().toString();
                    TextView response9 = findViewById(R.id.response9);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response9.setText(text);
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (!((String) text).startsWith("R")) {
                        i++;
                    }
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                }
                if (i == 9) {
                    guess = guess10.getText().toString();
                    TextView response10 = findViewById(R.id.response10);
                    CharSequence text = player.getGuess(guess);
                    String turns = getString(R.string.counter);
                    response10.setText(text);
//                    DialogFragment newFragment = new FireMissilesDialogFragment();
//                    newFragment.show(getSupportFragmentManager(), "missiles");;
                    turnCounter.setText(turns.concat(Integer.toString(player.getNumOfTurns())));
                    if (((String) text).contains("won")) {
                        submitButton.setText(R.string.leaderboard);
                        Intent mIntent = new Intent(GameView.this, leaderboard.class);
                        mIntent.putExtra("player", player);
                        startActivity(mIntent);
                        return;
                    }
                    i++;
                }
                if (i == 10) {
                    submitButton.setText(R.string.leaderboard);
                    Intent mIntent = new Intent(GameView.this, leaderboard.class);
                    mIntent.putExtra("player", player);
                    startActivity(mIntent);
                }
            }
        });
    }
}
