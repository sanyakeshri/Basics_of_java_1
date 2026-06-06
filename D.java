//Lec 16(Logical Operators)->checks two conditions:

// 'AND'->'&&'   (both true than only true)
// 'OR'->'||'    (both false than only false)
// 'NOT'->'!'   (T->F , F->T)
class A
{
    public static void main(String[]args)
    {
        int x = 7;
        int y = 5;

        int a = 5;
        int b = 9;

        // boolean result = x > y && a > b;        //(T && F -> F)
        // boolean result = x > y || a > b;        //(T || F -> T)
        // boolean result = x > y || a > b || a>1;        //(T || F || T -> T)
        // System.out.println(result);


        boolean result = a > b;
        System.out.println(!result);
    }
}