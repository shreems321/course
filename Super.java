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
        super(5);
    System.out.println("in b");
    }
    public b(int n)
    {
        super();
        System.out.println("in b int");
    }
}

    
public class Super
{
    public static void main(String a[])
    {
    
        b obj = new b();
        //a obj1 = new a(10);
        //System.out.println(obj.b());
    }
   
}
    
