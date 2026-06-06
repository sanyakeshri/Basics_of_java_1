//Lec 18(IF,ELSE-IF):
class A
{
    public static void main(String[]args)
    {

        int x = 8;
        int y = 17;
        int z = 9;

        if(x>y && x>z)      //False
            System.out.println(x);

        else if(y>x && y>z)
            System.out.println(y);

        else
            System.out.println(z);
    }
}