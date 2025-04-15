public class Mda {
   
    public static void main(String a[])
    {
        int nums [][] = new int[4][6];


        for (int i = 0; i<4; i++)
        {
            for (int j = 0; j<6; j++)
            {
           nums[i][j] = (int)(Math.random() * 10);
           System.out.println(nums[i][j]);
            }
        }
        for (int i = 0; i<4; i++)
        {
            for (int j = 0; j<6; j++)
            {
                System.out.print(nums[i][j] +" ");
               
            }
            System.out.println();
        }
    }

}