interface Computer
{
   void code();

}
class Developer 
{
  public void devApp(Computer lap)
  {
    lap.code();
  }
}
class Laptop implements Computer
{
  public void code()
  {
    System.out.println("code, compile and execute");
  }
}
class  Desktop implements Computer
{
  public void code()
  {
    System.out.println("code, compile and execute :Faster");
  }
}
public class Interface
{
    public static void main(String a[])
    
   {
    Computer lap = new Laptop();
    Computer desk = new Desktop();
    
    Developer obj = new Developer();
    obj.devApp(desk);

   }
}
