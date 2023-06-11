// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // for loop that goes from 1 to 30 by count of 1
        for (int i = 0; i <= 30; i++) {
            // print out each number
            System.out.println(i);
        }

        System.out.println(); // print blank to separate each task

        // for loop that counts down from 30 to 1 by count of 1
        for (int j = 30; j >= 0; j--) {
            // print out each number
            System.out.println(j);
        }

        System.out.println(); // print blank to separate each task

        // for loop that counts from 0 to 18 by count of 3
        for (int k = 0; k <= 18; k = k + 3) {
            // print out each number
            System.out.println(k);
        }

        System.out.println(); // print blank to separate each task

        // for loop that counts down from 10 to 0 by count of 2
        for (int l = 10; l >= 0; l = l - 2) {
            // print out each number
            System.out.println(l);
        }

        System.out.println(); // print blank to separate each task

        // nested loop to create figure of
        // *
        // **
        // ***
        // ****
        // *****

        // Outer loop for the number of rows
        for (int p = 1; p <= 5; p++) {
            // Inner loop for printing asterisks in each row
            for (int q = 1; q <= p; q++) {
                // print out character
                System.out.print("*");
            }
            // Print a new line after each row
            System.out.println();
        }

        System.out.println(); // print blank to separate each task

        // nested loop to create figure of
        // *****
        // ****
        // ***
        // **
        // *

        // Outer loop for the number of rows
        for (int p = 1; p <= 5; p++) {
            // Inner loop for printing asterisks in each row
            for (int q = 5; q >= p; q--) {
                // print out character
                System.out.print("*");
            }
            // Print a new line after each row
            System.out.println();
        }

        System.out.println(); // print blank to separate each task

        // nested loop to create figure of
        // *****
        // *****
        // *****
        // *****
        // *****

        // Outer loop for the number of rows
        for (int p = 1; p <= 5; p++) {
            // Inner loop for printing asterisks in each row
            for (int q = 1; q <= 5; q++) {
                // print out character
                System.out.print("*");
            }
            // Print a new line after each row
            System.out.println();
        }


    }
}