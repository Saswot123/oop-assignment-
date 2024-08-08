package week4;

import java.util.Scanner;

public class SphereCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = calculateVolume(radius);
        double surfaceArea = calculateSurfaceArea(radius);

        System.out.printf("Volume of the sphere: %.4f\n", volume);
        System.out.printf("Surface area of the sphere: %.4f\n", surfaceArea);

        scanner.close();
    }

    public static double calculateVolume(double radius) {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    public static double calculateSurfaceArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
