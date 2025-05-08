//@functionalInterface
interface A
{
  void show();
  
}
public class FuncInt
{

public static void main(String a[])
{
  A obj = new A()
  {
    public void show()
    {
      System.out.println("in show");
    }
  };
  obj.show();

}
}         
