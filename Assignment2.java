import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // Declare Variables
        Scanner input = new Scanner(System.in);
        int diamondDimension;
        int numAsterisks;
        int numSpaces;

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
        numAsterisks = 1;
        numSpaces = (diamondDimension / 2);

        // Analyze user input
        if(diamondDimension % 2 != 0) {
            // Generate odd diamond
            for(int i = 0; i < diamondDimension; i++) {
                // Print line
                for(int j = 0; j < (numSpaces + numAsterisks); j++) {
                    if(j < numSpaces) {
                        // Insert spaces before first character
                        System.out.print(" ");
                    } else {
                        // Insert asterisks
                        System.out.print("*");
                    }
                }

                // Alter algorithm variables accordingly
                if(i < (diamondDimension / 2)) {
                    numAsterisks += 2;
                    numSpaces--;
                } else {
                    numAsterisks -= 2;
                    numSpaces++;
                }

                // Go to next line
                System.out.println();
            }

        } else {
            // Generate even diamond
            for(int i = 0; i <= diamondDimension; i++) {
                // Print line
                for(int j = 0; j < (numSpaces + numAsterisks); j++) {
                    // Insert spaces
                    // Check first row special case
                    if(j < numSpaces) {
                        if(i == 0 && j == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("  ");
                        }
                    } else {
                        // Insert asterisks
                        // Check last row special case
                        if(i == diamondDimension) {
                            System.out.print(" *");
                        } else {
                            System.out.print("* ");
                        }
                    }
                }

                // Alter algorithm variables accordingly
                if (i < (diamondDimension / 2)) {
                    if(i == 0) {
                        numAsterisks++;
                        numSpaces--;
                    } else {
                        numAsterisks += 2;
                        numSpaces--;
                    }
                } else {
                    if(i == (diamondDimension - 1)) {
                        numAsterisks--;
                    } else {
                        numAsterisks -= 2;
                        numSpaces++;
                    }
                }

                // Go to next line
                System.out.println();
            }
        }
    }
}
