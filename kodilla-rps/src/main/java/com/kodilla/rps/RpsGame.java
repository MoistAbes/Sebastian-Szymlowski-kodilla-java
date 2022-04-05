package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    private int roundsToWin;
    private int round;
    private Player player1;
    private Player player2;


    public RpsGame(){
        player1 = new Player();
        player2 = new Player();
    }


    public void getPlayerNameAndRoundsToWin(){

        if (round == 0){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj swoje imie: ");
            player1.setName(scanner.nextLine());

            System.out.print("Podaj liczbe wygranych rund potrzebnych do zwyciestwa: ");
            this.roundsToWin = scanner.nextInt();
        }


    }

    public void showInfoAboutTheGame(){

        if (round == 0) {
            System.out.println("");
            System.out.println("INSTRUKCJA GRY");
            System.out.println("Klawisz 1 - zagranie \"kamień\"");
            System.out.println("Klawisz 2 - zagranie \"papier\"");
            System.out.println("Klawisz 3 - zagranie \"nożyce\"");
            System.out.println("klawisz x – zakończenie gry poprzedzone pytaniem \"Czy na pewno zakończyć grę?\"");
            System.out.println("klawisz n – uruchomienie gry od nowa poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\"");
            System.out.println("");
        }
    }


    public void roundStart(){

        Scanner scanner = new Scanner(System.in);
        this.round++;
        System.out.println("");

        System.out.print("Wykonaj ruch: ");
        player1.play(scanner.nextInt());
        player2.play(randomPlayerMove());

        System.out.println(player1.getName() + " wybrał " + intMoveToString(player1.getPlayerMove()));
        System.out.println("Gracz 2 wybrał " + intMoveToString(player2.getPlayerMove()));
        System.out.println(decideRoundWinner());
        System.out.println(player1.getName() + " wygrane rundy: " + player1.getPoints() + " Gracz 2 wygrane rundy: " + player2.getPoints());

        if (player1.getPoints() == roundsToWin || player2.getPoints() == roundsToWin) {
            System.out.println(decideMatchWinner());
            startNewGameOrEndGame();

        }

    }



    private String decideRoundWinner(){
        if (player1.getPlayerMove() == player2.getPlayerMove()){
            return "Remis!";
        }else if (player1.getPlayerMove() == 1 && player2.getPlayerMove() == 3){
            player1.addPoint();
            return player1.getName() + " wygrał!";
        }else if (player1.getPlayerMove() == 2 && player2.getPlayerMove() == 1){
            player1.addPoint();
            return player1.getName() + " wygrał!";
        }else if (player1.getPlayerMove() == 3 && player2.getPlayerMove() == 2){
            player1.addPoint();
            return player1.getName() + " wygrał!";
        }else {
            player2.addPoint();
            return "Gracz 2 wygrał!";
        }
    }

    private void startNewGameOrEndGame(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("Zakończ grę (x) lub zacznij nową gre (n): ");
        String  playerChoice = scanner.nextLine();

        if (playerChoice.equals("x")) {
            System.exit(0);
        }
        else if (playerChoice.equals("n"))
            startNewGame();

    }

    private void startNewGame(){
        round = 0;
        player1.resetPoints();
        player2.resetPoints();
    }


    private String decideMatchWinner(){
        if (player1.getPoints() == roundsToWin)
            return player1.getName() + " Wygrywa gre!";

        return "Gracz 2 wygrywa gre!";
    }

    private int randomPlayerMove(){
        Random random = new Random();
        int n = random.nextInt(3);
        n += 1;

        return n;
    }

    private String intMoveToString(int move){
        if (move == 1)
            return "kamień";
        else if (move == 2)
            return "papier";
        else
            return "nożyce";
    }



}
