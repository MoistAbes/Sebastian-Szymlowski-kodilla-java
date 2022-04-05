package com.kodilla.rps;

public class Player {
    private String name;
    private int points;
    private int playerMove;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPoint(){
        this.points++;
    }

    public int getPoints(){
        return points;
    }

    public void resetPoints(){
        this.points = 0;
    }

    public void play(int playerMove){
        this.playerMove = playerMove;
    }

    public int getPlayerMove(){
        return playerMove;
    }
}
