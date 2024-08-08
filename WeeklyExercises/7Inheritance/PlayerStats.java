package week6;
public class PlayerStats {
    protected String playerName;
    protected int gamesPlayed;
    protected int goalsScored;

    public PlayerStats(String playerName, int gamesPlayed, int goalsScored) {
        this.playerName = playerName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
    }

    public void displayStats() {
        System.out.println("Player: " + playerName);
        System.out.println("Games Played: " + gamesPlayed);
        System.out.println("Goals Scored: " + goalsScored);
    }
}

