
class Human
{
   private int age = 11;
    private String name = "Sonu";

    public int getAge()
{
    return age;
}
public void setAge(int a)
{
    age = a;
}
public String getName()
{
    return name;
}
public void setName(String n)
{
    name = n;
}
}
    
public class Encap
{
    public static void main(String a[])
    {
        Human obj = new Human();
        obj.setAge (21);
        obj.setName ("sonu");
       System.out.println(obj.getName() + ":" + obj.getAge() );
       // System.out.println(obj.name);
    }
}
