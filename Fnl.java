class Calc
{
  public final void show()
  {
    System.out.println("By Raja");
  }
  public void add(int a, int b)
  {
    System.out.println(a+b);
  }
}
class AdvCalc extends Calc
{
 public void show()
{
  System.out.println("by Sonu");
}
}

public class Fnl
{
    public static void main(String a[])
    
    {
     AdvCalc obj = new AdvCalc();
     //A obj = new A();
      obj.show();
      obj.add(4,5);
    }
   
}  
