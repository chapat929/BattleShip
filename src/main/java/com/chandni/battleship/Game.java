package com.chandni.battleship;

public class Game {

    private boolean[] board;
    private Player player;

    public void go() {
        setupBoard();
        getPlayers();
        startGame();
    }

    private void setupBoard() {
        board = new boolean[]{false, true, true, true, false};
    }

    private void getPlayers() {
        player = new Player();
    }

    private void startGame() {
        System.out.println("Welcome to battleship!  One of the best games every invented.  Guess where my ship is and you win!");
        System.out.println("What Position do you think my battleship is in?  1, 2, 3, 4, or 5?");
        Integer playerGuess = player.getGuess();
//        System.out.println(board[playerGuess]);
        if (board[playerGuess]) {
            System.out.println("you hit my battleship!");
            System.out.println("Congratulations you've won!");
        } else {
            System.out.println("Hahhaha, you missed!");
        }


    }
}
