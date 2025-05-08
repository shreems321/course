

public class ThrowKeyword
{
  
  public static void main(String a[])
  {
   int i = 20;
   int j = 0;
  
   try {
    j = 20/i;
   
    if(j==0);
    throw new ArithmeticException("I dont want to print Zero");
   } 
   catch (ArithmeticException e) 
   {
    j=20/1;
    System.out.println("their is some problem" +e );
   }
    catch(Exception e)
    {
      System.out.println("Something went wrong" +e );
    }
   {
    System.out.println(j);
    System.out.println("bye");
   
   }
  }
}         
