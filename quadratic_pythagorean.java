
/**
 * Allow a user to choose to calculate the hypotenuse of a right triangle using the
 * of the Pythagorean Theorem or the value of x using the Quadratic Equation 
 *
 * @author (Ms. Schulze)
 * @version (1.0)
 */

import java.util.Scanner;

public class quadratic_pythagorean
{
    public static void main(String[] args)
    {
        // Clear the BlueJ terminal
        System.out.println('\u000C');
        
        // Instantiate the input from the user.
        Scanner inputScanner = new Scanner(System.in);
        double aValue;
        double bValue;
        double cValue;
        double quadraticResult1;
        double quadraticResult2;
        double hypotenuseResult;
        int decision;
        String playAgain = "yes";
        
        while (playAgain.equals("yes") || playAgain.equals("Yes"))
        {
            // Prompt the user for which function they would like to use.
            System.out.println("This app can calculate the quadratic equation or the pythagorean theorem.");
            System.out.println("Choose 1 for the quadratic equation.");
            System.out.println("Choose 2 for the pythagorean theorem.");
            decision = inputScanner.nextInt();
            System.out.println("Your choice was " + decision + ".  Gotcha!");
            
            if (decision == 1)  // Quadratic Equation
            {
                // input for quadratic equation
                System.out.println("This app will allow you to calculate the quadratic equation.  But you need to enter the values first.");
                System.out.print("Input the value for a:  ");
                aValue = inputScanner.nextDouble();
                System.out.print("Input the value for b:  ");
                bValue = inputScanner.nextDouble();
                System.out.print("Input the value for c:  ");
                cValue = inputScanner.nextDouble();
                
                // Use inputted values to calculate the quadratic equation.
                quadraticResult1 = (-bValue + Math.sqrt(Math.pow(bValue, 2) - 4*aValue*cValue)) / (2*aValue);
                quadraticResult2 = (-bValue - Math.sqrt(Math.pow(bValue, 2) - 4*aValue*cValue)) / (2*aValue);
                
                // Display calculated answer for quadratic formula
                System.out.println("The answer is: x = " + quadraticResult1 + ", " + quadraticResult2 + ".");
            }
            else if (decision == 2)  // Pythagorean Theorem
            {
                System.out.println("This app will allow you to calculate the hypotenuse of a right triangle.");
                System.out.print("Input the value for a:  ");
                aValue = inputScanner.nextDouble();
                System.out.print("Input the value for b:  ");
                bValue = inputScanner.nextDouble();
                
                // Calculate the length of the hypotenuse of a right triangle
                hypotenuseResult = Math.sqrt(Math.pow(aValue, 2) + Math.pow(bValue, 2));
                
                // Display calculated answer for the Pythagorean formula
                System.out.println("The hypotenuse is:  " + hypotenuseResult + ".");
            }
            else  // Unrecognized input
            {
                System.out.println("I'd love to help you, but I don't understand your choice.  Please try again.");
            }
            
            // Prompt user whether they want to play again.
            System.out.println("Do you want to calculate another equation?");
            System.out.println("Type yes or no.");
            System.out.print("Your choice:  ");
            playAgain = inputScanner.next();  // This allows the user to input the while loop condition.System.out.print
            
        }
    }
}
