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
            for(int numReadableChars = 1, numSpaces = ((diamondDimension - 1) / 2);
                numReadableChars <= diamondDimension; numReadableChars += 2, numSpaces--) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numReadableChars; j++) {
                    System.out.print("*");
                }

                // Go to next line
                System.out.println("");
            }

            // Generate bottom half of diamond
            for(int numReadableChars = (diamondDimension - 2), numSpaces = 1;
                numReadableChars > 0; numReadableChars -= 2, numSpaces++) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numReadableChars; j++) {
                    System.out.print("*");
                }

                // Go to next line
                System.out.println("");
            }
        } else {
            // Generate top half of diamond
            for(int numReadableChars = 1, numSpaces = (diamondDimension - 1);
                numReadableChars <= diamondDimension; numReadableChars++, numSpaces--) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numReadableChars; j++) {
                    System.out.print("* ");
                }

                // Go to next line
                System.out.println("");
            }

            // Generate bottom half of diamond
            for(int numReadableChars = (diamondDimension - 1), numSpaces = 1;
                numReadableChars > 0; numReadableChars--, numSpaces++) {

                // Print spaces before first character
                for(int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }

                // Print readable characters
                for(int j = 0; j < numReadableChars; j++) {
                    System.out.print("* ");
                }

                // Go to next line
                System.out.println("");
            }
        }
    }
}
