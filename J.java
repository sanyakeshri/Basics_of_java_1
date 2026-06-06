// Coding Exercise 3: Java Conditionals:
// Evaluate Student Result with If-Else and Grading Logic
// Expected Output:
/*Passed
Grade: B */

class A
{
    public static void main(String[] args)
    {
    
        int score = 75;
        char grade = 'B';
        
        //Check pass or fail
        if(score > 50)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }

        //Determine grade based on score
        if(score>=90)
        {
            System.out.println("Grade: A");
        }
        else if(score>= 75)
        {
            System.out.println("Grade: B");
        }
        else if(score>=60)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Grade: D");
        }
    }
}