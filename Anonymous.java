
class A
{
  public void show()
  {
    System.out.println("in show");
  }
  
}
public class Anonymous
{
    public static void main(String a[])
    
    {
      A obj = new A()
      {
        public void show()
        {
          System.out.println("new show ");
        }

      };
      obj.show();
     
    }
   
}
