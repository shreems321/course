class SrinivasException extends Exception
{
public SrinivasException(String string)
{
 super (string);
}
 
}
public class OwnExcep
{
  
  public static void main(String a[])
  {
   int i = 20;
   int j = 0;
  
   try {
    j = 20/i;
   
    if(j==0);
    throw new SrinivasException("I dont want to print Zero");
   } 
   catch (SrinivasException e) 
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
