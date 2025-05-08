abstract class Car
{
  public abstract void fly();

  public abstract void drive();
  
  public void PlayMusic()
  {
    System.out.println("Play Music");
  }
}
class WagonR extends Car // Concrete Class to create the Object cause Object cannot be created without a regular class.
{
  public void fly()
  {
    System.out.println("Flying");
  }
  public void drive()
  {
    System.out.println("Driving");
  }
}

public class Abstract
{
    public static void main(String a[])
    
    {
      Car obj = new WagonR();
      obj.drive();
      obj.PlayMusic();
      obj.fly();
    }
   
}

