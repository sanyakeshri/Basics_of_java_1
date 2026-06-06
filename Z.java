// Lec 34(Multi Dimensional Array):
class A
{
    public static void main(String []args)
    {
        int nums [][] = new int [3][4];
        int i;
        int j;
        
        // Take random(random function returns double value)values by using keyword "Math":
        // int random = 0;
        // int random = Math.random();     //give double
        // Converted into "int":
        // int random = (int)Math.random() * 10;

        for(i=0 ; i<3 ; i++)
        {
            for(j=0 ; j<4 ; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                // System.out.print(nums[i][j]);
            }
            System.out.println();
        }


        // for(i=0 ; i<3 ; i++)
        // {
        //     for(j=0 ; j<4 ; j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        // System.out.println();
        // }

        // OR

        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m+ " "); 
            }
            System.out.println();
        }
    }
}