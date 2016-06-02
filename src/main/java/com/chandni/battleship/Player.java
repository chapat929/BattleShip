package com.chandni.battleship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

    public Integer getGuess() {
        String playerResponse = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            playerResponse = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(playerResponse);
    }
}
