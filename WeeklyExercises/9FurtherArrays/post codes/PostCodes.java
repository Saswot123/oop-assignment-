package week9;

import java.util.Scanner;

public class PostCodes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store up to 25 pairs of names and postal codes
        Person[] people = new Person[25];

        System.out.println("Enter up to 25 pairs of names and postal codes (each separated by a tab):");
        System.out.println("Format: First Name <tab> Last Name <tab> Postal Code");
        System.out.println("Press Enter on an empty line to finish input.");

        int count = 0;
        while (count < 25 && scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break; // Exit loop if the line is empty
            }

            String[] parts = line.split("\t");
            if (parts.length != 3) {
                System.out.println("Invalid input format. Please enter First Name, Last Name, and Postal Code separated by tabs.");
                continue;
            }

            String firstName = parts[0];
            String lastName = parts[1];
            String postalCode = parts[2];

            people[count] = new Person(firstName, lastName, postalCode);
            count++;
        }

        System.out.println("\nList of individuals:");
        for (int i = 0; i < count; i++) {
            Person person = people[i];
            System.out.println(person.getFirstName() + " " + person.getLastName() + ", " + person.getPostalCode());
        }
    }
}
