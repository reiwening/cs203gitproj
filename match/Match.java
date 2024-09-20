package cs203gitproj;
import java.lang.*;
import java.util.*;

public class Match {
    private long matchId;
    private Tournament tournament; 
    private Player player1;
    private Player player2;

    private boolean statusP1;
    private boolean statusP2;

    private Player winner;
    private boolean isComplete;
    private int eloChange;

    public Match(Tournament tournament) {
        this.matchId = null;
        this.tournament = tournament;
        this.player1 = null;
        this.player2 = null;

        this.statusP1 = false;
        this.statusP2 = false;

        this.winner = null;
        this.isComplete = false;
        this.eloChange = null;
    }

    public Match(Tournament tournament, Player player1, Player player2) {
        this.matchId = null;
        this.tournament = tournament;
        this.player1 = player1;
        this.player2 = player2;

        this.statusP1 = false;
        this.statusP2 = false;

        this.winner = null;
        this.isComplete = false;
        this.eloChange = null;
    }


    // Setter methods
    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }
    
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void setStatusP1() {
        System.out.println("Player 1 Status: Checked-In");
        this.statusP1 = true;
    }
    
    public void setStatusP2() {
        System.out.println("Player 2 Status: Checked-In");
        this.statusP2 = true;
    }
    
    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setIsCompleteStatus(boolean status) {
        this.isComplete = status;
    }

    // 16/9/24: Later do
    public void setEloChange() {
        
    }

    



    // Getter methods
    public long getMatchId() {
        return matchId;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public Player getPlayer1() {
        return player1;
    }
    
    public Player getPlayer2() {
        return player2;
    }

    public boolean getStatusP1() {
        return statusP1;
    }
    
    public boolean getStatusP2() {
        return statusP2;
    }

    public Player getWinner() {
        return winner;
    }

    public boolean getIsCompleteStatus() {
        return isComplete;
    }
    
    // 16/9/24: Later do 
    public int getEloChange() {
        
    }

}