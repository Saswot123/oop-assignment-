package week6;
public class FootballStats extends PlayerStats {
    private int assists;
    private int yellowCards;
    private int redCards;

    public FootballStats(String playerName, int gamesPlayed, int goalsScored, int assists, int yellowCards, int redCards) {
        super(playerName, gamesPlayed, goalsScored);
        this.assists = assists;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    
    public void displayStats() {
        super.displayStats();
        System.out.println("Assists: " + assists);
        System.out.println("Yellow Cards: " + yellowCards);
        System.out.println("Red Cards: " + redCards);
    }
}
