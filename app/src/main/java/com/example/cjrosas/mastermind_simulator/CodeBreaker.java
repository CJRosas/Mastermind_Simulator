package com.example.cjrosas.mastermind_simulator;

import java.util.*;

public class CodeBreaker {
    private static List<String> allCombinations = new ArrayList<String>();
    private static final String[] letters = new String[6];
    private static int numOfTurns = 10;
    private static String player;
    private static String secretC;
    private static String[] secretCode = new String[4];
    private static CodeBreaker highScore;

    public CodeBreaker(String p) {
        player = p;
        Random obj = new Random();
        getAllCombinations();
        secretC = allCombinations.get(obj.nextInt(allCombinations.size()));
        secretCode[0] = secretC.substring(0,1);
        secretCode[1] = secretC.substring(1,2);
        secretCode[2] = secretC.substring(2,3);
        secretCode[3] = secretC.substring(3,4);
    }

    public static String getGuess(String g) {
        if (numOfTurns == 0) {
            return "You lost!";
        } else {
            String guess = g;
            if (allCombinations.contains(guess)) {
                numOfTurns--;
                return isCorrect(guess);
            } else {
                return "RETRY";
            }
        }
    }
    public void getAllCombinations() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 6; l++) {
                        String possible = letters[i]+letters[j]+letters[k]+letters[l];
                        allCombinations.add(possible);
                    }
                }
            }
        }
    }

    public static String isCorrect(String guess) {
        if (guess.equals(secretC)) {
            return winGame();
        } else {
            return checkCorrect(guess);
        }
    }

    public static String checkCorrect(String g) {
        String pegs = "";
        String[] guess = new String[4];
        for (int i = 0; i < g.length(); i++) {
            guess[i] = g.substring(i, i + 1);
        }
        List<String> seen = new ArrayList<>();
        for (int i = 0; i < guess.length; i++) {
            if (guess[i].equals(secretCode[i])) {
                pegs = pegs.concat("B");
                seen.add(guess[i]);
            }
        }
        for (int i = 0; i < guess.length; i++) {
            if (secretC.contains(guess[i]) && !(seen.contains(guess[i]))) {
                pegs = pegs.concat("W");
                seen.add(guess[i]);
            } else {
                pegs = pegs.concat(" ");
            }
        }
        String shuffledString = "";

        while (pegs.length() != 0)
        {
            int index = (int) Math.floor(Math.random() * pegs.length());
            String c = pegs.substring(index, index + 1);
            pegs = pegs.substring(0,index)+pegs.substring(index+1);
            shuffledString = shuffledString.concat(c);
        }

        shuffledString = shuffledString.replaceAll(" ", "");
        return shuffledString;

    }

    public static String winGame() {
//        if (highScore == null) {
//            highScore = this;
//        }
//        int turns = highScore.getNumOfTurns();
//        if (turns > numOfTurns) {
//            highScore = this;
//        }
        return player + " won with " + numOfTurns + " turns left!";
    }

    public static String getHighPlayersScore() throws NullPointerException {
        try {
            return Integer.toString(highScore.getNumOfTurns());
        } catch (Exception e) {
            return "No one has won yet ;)";
        }
    }

    public static int getNumOfTurns() {
        return numOfTurns;
    }

    public String[] getSecretCode() {
        return secretCode;
    }
}