

public class Excep


{
  
  public static void main(String a[])
  {
   int i = 10;
   int j = 0;
   int nums[] = new int[5];
   String str = null;
  
   try {
    j = 20/i;
    System.out.println(nums[4]);
    System.out.println(str.length());
   } 
   catch (ArithmeticException e) 
   {
    System.out.println("their is some problem" );
   }
    catch(IndexOutOfBoundsException e)
    {
      System.out.println("Out of bonds");
    }
    catch(Exception e)
    {
      System.out.println("Something went wrong" +e);
    }
   {
    System.out.println(j);
    System.out.println("bye");
   
   }
  }
}     