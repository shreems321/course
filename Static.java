class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand  + ":" + price + ":" + name );
    }

}

public class Static 
{   
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smart Phone";
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1400;
        obj2.name = "Smart Phone";

        Mobile.name = "phone";

        obj1.show();
        obj2.show();


        

    }

    
}
