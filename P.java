// QUESTION:1
//Coding Exercise 4:Mastering Loops in Java: For, While, and Do-While in Action
//Expected Output:
// For Loop: 1 2 3 4 5 While Loop: 1 2 3 4 5 Do-While Loop: 1 2 3 4 5

public class Exercise
{
    public static void main(String[] args)
    {

        // For Loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(i + " ");
        }

        // While Loop
        System.out.print("While Loop: ");
        int j = 1;
        while (j <= 5)
        {
            System.out.print(j + " ");
            j++;
        }

        // Do-While Loop
        System.out.print("Do-While Loop: ");
        int k = 1;
        do
        {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
    }
}