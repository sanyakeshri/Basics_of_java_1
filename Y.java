// Lec 33(Creation of Array):
class Demo
{
    public static void main(String args[])
    {
        // int nums[] = {3,7,2,4};
        // nums 1 = 6;         //Change value

        // int nums[] = new int[4];
        int nums[] = new int[4];
        // Set's value
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // System.out.println(nums[1]);

        // for printing every array element:
        for(int i = 0 ; i<4 ; i++)
        {
            System.out.println(nums[i]);
        }
        
        

    }
}