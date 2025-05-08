enum Laptop{
    Dell(1500), HP, Apple(2000), Thinkpad(800);
  private int price;
  private Laptop(){
   price = 500;
  }
    private Laptop(int price){
      this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
  }
  public class EnumUsingConst{
      public static void main(String a[])
     {
        for (Laptop lap : Laptop.values())
        {
          System.out.println(lap + ":" + lap.getPrice());
        }
     }
    }