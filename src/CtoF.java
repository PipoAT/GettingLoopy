import java.util.Scanner; // import scanner for user input

public class CtoF {
    public static void main(String[] args) {

        // declare and initialize scanner for user input
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        double tempInC = 0; // temperature in degrees C
        double tempInF = 0; // temperature in degrees F
        String trash = ""; // string variable for if the user does not input a number
        boolean valid = true; // boolean variable to determine if user input is valid or not


        do {
            // prompt for user input
            valid = false;
            System.out.println("Please enter the temperature in degrees C: ");

            // checks for if the input is a number of type int or double
            if (in.hasNextDouble()) {
                // read the user input and set to the variable
                tempInC = in.nextDouble();
                // convert from C to F
                tempInF = (tempInC * (1.8)) + 32;
                // output the resulting conversion
                System.out.println("The converted temperature from C to F is: " + tempInF);
                valid = true;
            } else {
                // output error in input and have user try again
                trash = in.nextLine();
                System.out.println("You stated the temperature to be: " + trash);
                System.out.println("This is an invalid input. Please reenter the input as a number.");
            }
        } while (!valid);

    }
}
