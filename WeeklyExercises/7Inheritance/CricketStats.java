package week6;

public class CricketStats extends PlayerStats {
    private int runsScored;
    private int wicketsTaken;

    public CricketStats(String playerName, int gamesPlayed, int runsScored, int wicketsTaken) {
        super(playerName, gamesPlayed, 0); // Cricket doesn't have goals, so setting goals scored to 0
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Runs Scored: " + runsScored);
        System.out.println("Wickets Taken: " + wicketsTaken);
    }
}
