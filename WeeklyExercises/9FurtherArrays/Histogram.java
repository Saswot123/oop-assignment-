package week9;

import java.util.Scanner;

public class Histogram {

    public static int[] generateHistogram(int[] data) {
        int[] histogram = new int[10];
        for (int value : data) {
            int index = (value - 1) / 10;
            histogram[index]++;
        }
        return histogram;
    }

    public static void printHistogram(int[] histogram) {
        for (int i = 0; i < histogram.length; i++) {
            int lowerBound = i * 10 + 1;
            int upperBound = (i + 1) * 10;
            System.out.printf("%3d - %3d | ", lowerBound, upperBound);
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by spaces:");
        String[] inputValues = scanner.nextLine().split(" ");
        int[] values = new int[inputValues.length];
        try {
            for (int i = 0; i < inputValues.length; i++) {
                values[i] = Integer.parseInt(inputValues[i]);
                if (values[i] < 1 || values[i] > 100) {
                    throw new NumberFormatException();
                }
            }
            int[] histogram = generateHistogram(values);
            printHistogram(histogram);
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers in the range 1 to 100 inclusive.");
        }
    }
}
