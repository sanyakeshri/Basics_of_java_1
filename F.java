//Lec 17(IF-ELSE):
class A
{
    public static void main(String[]args)
    {

        int x =5;
        int y =7;

        // If one statement inside then braces is not necessary:
        if(x > y)
            System.out.println(x);

        //necessary if two statements:
        else{
            System.out.println(y);
            System.out.println("Thank you");
        }
    }
}