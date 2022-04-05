package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        RpsGame game = new RpsGame();

        boolean end = false;

        while (!end){
            game.getPlayerNameAndRoundsToWin();
            game.showInfoAboutTheGame();
            game.roundStart();

        }




    }
}
