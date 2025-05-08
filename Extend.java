class a extends Object
{
    public a()
    {
    System.out.println("in a");
    }
    public a(int n)
    {
        System.out.println("in a int");
    }
}
class b extends a
{
    public b()
    {
        super();
    System.out.println("in b");
    }
    public b(int n)
    {
        this();
        System.out.println("in b int");
    }


}

    
public class Extend
{
    public static void main(String a[])
    {
    
        b obj = new b(10);
        //a obj1 = new a(10);
        //System.out.println(obj.b());
    }
   
}
