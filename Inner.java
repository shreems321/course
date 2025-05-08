class A
{
  public void show()
  {
    System.out.println("in show");
  }

 static class B                           // when it is not static 
  {
    public void config()
    {
      System.out.println("in config");
    }
  }
}
public class Inner
{
    public static void main(String a[])
    
    {
      A obj = new A();
      obj.show();
      A.B obj1 = new A.B();     //A.B obj1 = obj new B(); only when the class is not static
      obj1.config();
    }
   
}
