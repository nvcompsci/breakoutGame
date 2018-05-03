/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package march.madness.bracket.picker;

/**
 *
 * @author jword
 */
public class Game {
    //Fields
    public int scoreWinner;
    public int scoreLoser;
    private Team winner;
    private Team loser;
    private Team[] participants;
    private double duration;
    private String location;
    private String date;
    private String round;
    
    //Constructor
    public Game(int scoreWinner, int scoreLoser, Team winner, Team loser, int overtimes, String location, String date, String round) {
        this.scoreWinner = scoreWinner;
        this.scoreLoser = scoreLoser;
        this.winner = winner;
        this.loser = loser;
        participants = new Team[] {winner, loser};
        duration = 40 + overtimes * 5;
        this.location = location;
        this.date = date;
        this.round = round;
    }
    //Getters and Setters
    
    public int getScoreWinner() {
        return scoreWinner;
    }

    public int getScoreLoser() {
        return scoreLoser;
    }

    public Team getWinner() {
        return winner;
    }

    public Team getLoser() {
        return loser;
    }

    public Team[] getParticipants() {
        return participants;
    }

    public double getDuration() {
        return duration;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getRound() {
        return round;
    }
    
}
