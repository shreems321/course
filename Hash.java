class Laptop
{
   int price;
   String model;
   public String toString()
   {
      return model + ":" + price;
   }
  

}
public class Hash
{
    public static void main(String a[])
    
    {
      Laptop obj1= new Laptop();
      obj1.price = 1000;
      obj1.model = "Lenovo";
     System.out.println(obj1);

    }
   
}