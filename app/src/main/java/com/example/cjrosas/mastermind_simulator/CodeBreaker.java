package com.example.cjrosas.mastermind_simulator;

import java.util.*;

public class CodeBreaker {
    private static List<String> allCombinations = new ArrayList<String>();
    private static final String[] letters = new String[6];
    private static int numOfTurns = 10;
    private static String player;
    private static String secretC;
    private static String[] secretCode = new String[4];
    private List<String> rules = new ArrayList<>();
    private CodeBreaker highScore;

    public CodeBreaker(String p) {
        player = p;
        Random obj = new Random();
        getAllCombinations();
        secretC = allCombinations.get(obj.nextInt(allCombinations.size()));
        for (int i = 0; i < secretC.length(); i++) {
            secretCode[i] = secretC.substring(i, i + 1);
        }
        getGuess();
    }

    public void getGuess() {
        if (numOfTurns == 0) {
            finishGame();
        } else {
            System.out.println("---");
            System.out.println("What is your guess?");
            String guess;
            Scanner getGuess = new Scanner(System.in);
            guess = getGuess.nextLine();
            if (allCombinations.contains(guess)) {
                System.out.println("---");
                System.out.println(player + " guessed " + guess + ".");
                System.out.println("---");
                numOfTurns--;
                System.out.println("Your turns left: " + numOfTurns + ".");
                isCorrect(guess);
            } else {
                System.out.println("---");
                System.out.println("Try again please.");
                getGuess();
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

    public void isCorrect(String guess) {
        if (guess.equals(secretC)) {
            System.out.println("---");
            System.out.println("You got it right!");
            System.out.println("---");
            winGame();
        } else {
            System.out.println("Not quite right...");
            System.out.println("---");
            System.out.println(checkCorrect(guess));
            getGuess();
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

    public List<String> finishGame() {
        List<String> answer = new ArrayList<>();
        answer.add("You lost!");
        answer.add("---");
        answer.add("The secret code was: " + secretC);
        return answer;
    }

    public String winGame() {
        if (highScore == null) {
            highScore = this;
        }
        int turns = highScore.getNumOfTurns();
        if (turns > numOfTurns) {
            highScore = this;
        }
        return player + " won with " + numOfTurns + " turns left!";
    }

    public String getHighPlayersScore() throws NullPointerException {
        try {
            return Integer.toString(highScore.getNumOfTurns());
        } catch (Exception e) {
            return "No one has won yet ;)";
        }
    }

    public int getNumOfTurns() {
        return numOfTurns;
    }

    public String[] getSecretCode() {
        return secretCode;
    }
}
