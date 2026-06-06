//Lec 14(Arithmetic Operators 2):
class A
{
    public static void main(String[]args)
    {
        int num1 = 7;
        
        // num1 = num1+2;
        // num1 +=2;
        // num1 +=1;
        // num1 ++;         //Post_increment
        // ++num1;             //Pre_increment
        // num1 --;         //dicrement

        // ++num and num++ is not same run it u will get the difference:

        int result = ++ num1;     //increment then fetch it.
        // int result = num1++;        //fetch the value then increment.
        System.out.println(num1);
        System.out.println(result);
    }
}