// QUESTION:2
// Coding Exercise 5: Smart Console Calculator: Advanced Exercise:
// Build Your First Java Program That Thinks
//Expected Output:
// Result: 10.0
// Thank you for using the calculator.

public class Exercise
{
    public static void main(String[] args)
    {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";

        // Run the loop while 'again' equals 'y'
        while (again.equals("y"))
        {

            double result;

            // Perform calculation based on operator
            if (operator == '+')
            {
                result = num1 + num2;
                System.out.println("Result: " + result);

            } else if (operator == '-')
            {
                result = num1 - num2;
                System.out.println("Result: " + result);

            } else if (operator == '*')
            {
                result = num1 * num2;
                System.out.println("Result: " + result);

            } else if (operator == '/')
            {
                // Check divide by zero
                if (num2 == 0)
                {
                    System.out.println("Cannot divide by zero.");
                } else
                {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }

            } else
            {
                System.out.println("Invalid operator.");
            }

            // Stop loop after first run
            again = "n";
        }

        // Print closing message
        System.out.println("Thank you for using the calculator.");
    }
}
