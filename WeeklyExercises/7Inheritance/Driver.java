package week6;

public class Driver {
    public static void main(String[] args) {
        FootballStats footballPlayer = new FootballStats("saswot", 24, 10, 5, 2, 1);
        CricketStats cricketPlayer = new CricketStats("prasen", 15, 50, 5);

        System.out.println("Football Player Stats:");
        footballPlayer.displayStats();

        System.out.println("\nCricket Player Stats:");
        cricketPlayer.displayStats();
    }
}
