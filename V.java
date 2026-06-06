// Lec 30(Methods Overloading):
class Calculator
{
    public int add(int num1 , int num2)
    {
        return num1+num2;
    }
    // both methods name can be same as "add" but parameters have to be different,
    // if parameter is same but different return-type that also gave an error.
    // That is called "Method Overloading".
    public int add(int num1 , int num2 , int num3)
    {
        return num1+num2+num3;
    }
}
class Demo{
    public static void main(String[]args)
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(3 , 4);
        System.out.println(r1);
    }
}