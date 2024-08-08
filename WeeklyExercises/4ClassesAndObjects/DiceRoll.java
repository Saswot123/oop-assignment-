package week4;
import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("How many sides does dice 1 have? ");
        int sidesDice1 = scanner.nextInt();

        System.out.print("How many sides does dice 2 have? ");
        int sidesDice2 = scanner.nextInt();

        int sumDice1 = 0, sumDice2 = 0;

        for (int i = 1; i <= 3; i++) {
            int rollDice1 = random.nextInt(sidesDice1) + 1;
            int rollDice2 = random.nextInt(sidesDice2) + 1;

            System.out.println("Dice 1 " + ordinal(i) + " roll = " + rollDice1 + ".");
            System.out.println("Dice 2 " + ordinal(i) + " roll = " + rollDice2 + ".");

            sumDice1 += rollDice1;
            sumDice2 += rollDice2;
        }

        double averageDice1 = (double) sumDice1 / 3;
        double averageDice2 = (double) sumDice2 / 3;

        System.out.println("Dice 1 rolled a total of " + sumDice1 + " and rolled " + averageDice1 + " on average.");
        System.out.println("Dice 2 rolled a total of " + sumDice2 + " and rolled " + averageDice2 + " on average.");

        scanner.close();
    }

    public static String ordinal(int number) {
        if (number == 1) {
            return "first";
        } else if (number == 2) {
            return "second";
        } else if (number == 3) {
            return "third";
        } else {
            return "";
        }
    }
}

