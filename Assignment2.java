import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Declare Variables
        Scanner input = new Scanner(System.in);
        int diamondDimension;

        // Ask user for input
        System.out.print("Please enter a positive integer (0 to exit): ");
        diamondDimension = input.nextInt();

        // Check input validity
        while(diamondDimension < 0) {
            System.out.print("Invalid input. Please re-enter: ");
            diamondDimension = input.nextInt();
        }

        // Check exit program
        if(diamondDimension == 0) {

            System.exit(0);

        }

        if(diamondDimension % 2 != 0) {
            // Generate top half of diamond
            for(int numAsterisks = 1, numSpaces = ((diamondDimension - 1) / 2);
                numAsterisks <= diamondDimension; numAsterisks += 2, numSpaces--) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numAsterisks; j++) {
                    System.out.print("*");
                }

                // Go to next line
                System.out.println("");
            }

            // Generate bottom half of diamond
            for(int numAsterisks = (diamondDimension - 2), numSpaces = 1;
                numAsterisks > 0; numAsterisks -= 2, numSpaces++) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numAsterisks; j++) {
                    System.out.print("*");
                }

                // Go to next line
                System.out.println("");
            }
        } else {
            // Generate top half of diamond
            for(int numAsterisks = 1, numSpaces = (diamondDimension - 1);
                numAsterisks <= diamondDimension; numAsterisks++, numSpaces--) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numAsterisks; j++) {
                    System.out.print("* ");
                }

                // Go to next line
                System.out.println("");
            }

            // Generate bottom half of diamond
            for(int numAsterisks = (diamondDimension - 1), numSpaces = 1;
                numAsterisks > 0; numAsterisks--, numSpaces++) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numAsterisks; j++) {
                    System.out.print("* ");
                }

                // Go to next line
                System.out.println("");
            }
        }
    }
}
