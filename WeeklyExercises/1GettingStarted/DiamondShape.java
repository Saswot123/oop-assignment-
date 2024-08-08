package student;

public class DiamondShape {
    public static void main(String[] args) {
        int size = 4; // size of the diamond
        int spaces = size - 1;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 0; i < size; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower half of the diamond
        spaces = 1;
        stars = 2 * size - 3;
        for (int i = 0; i < size - 1; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}

