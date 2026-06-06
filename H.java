//Lec 19(Ternary Operator):

// 1.Ternary operator is a short way to write if-else in one line.
// 2.It chooses between two values like this: condition ? value1 : value2.
// 3.Sign -> ?:
class A
{
    public static void main(String[]args)
    {

        int n = 4;
        int result = 0;

        // if(n%2==0)
        // {
        //     result = 10;
        // }
        // else
        //{
        //     result = 20;
        // }

        //TERNARY:
        result = n%2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}