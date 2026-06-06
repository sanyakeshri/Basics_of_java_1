// Lec 29(Methods):
class Computer
{
    public void playmusic()
    {
        System.out.println("Music playing....");
    }
    public String  getmepen(int cost)
    {
        if(cost <= 10)
            return "pen";

        return "Nothing";

    }
}
class Demo
{
    public static void main(String[]args)
    {

        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getmepen(12);
        System.out.println(str);
    }
}
