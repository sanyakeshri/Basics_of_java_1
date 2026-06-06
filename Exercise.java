/*Coding Exercise 2: Mastering Java Operators:
Arithmetic, Relational, and Logical in Action*/
// Expected Output:

/*Addition: 30
Subtraction: 10
Multiplication: 200
Division: 2
Is a greater than b? true
Is a > b and b > 0? true*/
public class Exercise
{
    public static void main(String[] args)
    {
    
        // write code here
        int a = 20;
        int b = 10;
        
        int result = a + b;
        int result1 = a - b;
        int result2 = a * b;
        int result3 = a / b;
        
        boolean result4 = a > b;
        boolean result5 = a > b && b>0;
        
        System.out.println("Addition: " + result);
        System.out.println("Subtraction: " + result1);
        System.out.println("Multiplication: " + result2);
        System.out.println("Division: " + result3);
        System.out.println("Is a greater than b? " + result4);
        System.out.println("Is a > b and b > 0? " + result5);
        
    }
}