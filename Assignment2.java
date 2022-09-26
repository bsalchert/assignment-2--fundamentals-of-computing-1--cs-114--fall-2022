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

        // Initialize algorithm variables
        int numAsterisks = 1;
        int numSpaces = (diamondDimension / 2);

        if(diamondDimension % 2 != 0) {
            // Generate odd diamond
            for(int i = 0; i < diamondDimension; i++) {
                // Insert spaces before first character
                for(int j = 0; j < numSpaces; j++) {
                    System.out.print(" ");
                }

                // Insert asterisks
                for(int k = 0; k < numAsterisks; k++) {
                    System.out.print("*");
                }

                // Alter algorithm variables accordingly
                if(i < (diamondDimension / 2)) {
                    numAsterisks += 2;
                    numSpaces--;
                } else {
                    numAsterisks -= 2;
                    numSpaces++;
                }
            }
        } else {
            
        }
    }
}
