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
            
        } else {
            
        }
    }
}
