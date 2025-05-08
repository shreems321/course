class Human
{
   private int age ;
    private String name;

    public Human()       //Default Constructor
    {
        //System.out.println("in constructor");
        age = 21;
        name = "Hero";
    }
    public Human(int a, String n)  //Parameterised Constructor
    {
        age = a;
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
    
public class Cons
{
    public static void main(String a[])
    {
        Human obj = new Human();
        Human obj1 = new Human(18, "Srinu");
        // obj.setAge (21);
        // obj.setName ("sonu");
        System.out.println(obj.getName() + ":" + obj.getAge() );
        System.out.println(obj1.getName() + ":" + obj1.getAge() );
       // System.out.println(obj.name);
    }
}

