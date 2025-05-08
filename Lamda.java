interface A
{
  void show();
}
public class Lamda
{

public static void main(String a[])
{
  A obj = () ->System.out.println("in show");
  obj.show();

}
}            
