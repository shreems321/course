class A
{
public void show()
{
  System.out.println("in Ashow");
}
}
class B extends A
{
public void show()
{
  System.out.println("in B show");
}
}
class C extends A
{
public void show()
{
  System.out.println("in C show");
}
}
class D extends A
{
  public void show()
  {
    System.out.println("in D show");
  }
}


public class Dmd
{
    public static void main(String a[])
    {
       A obj = new A();
       obj.show();
       obj = new B();
       obj.show();
       obj = new C();
       obj.show();
       obj = new D();
       obj.show();
    }
   
}  

