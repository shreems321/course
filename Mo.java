class Calculator
{
public int add(int n1,int n2)
{
    return n1+n2;
}
    /*public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    } */
    public double add(double n1,int n2)
    {
        return n1+n2;
    }
}

public class Mo {
  public static void main(String a[]) 
  {

  Calculator obj = new Calculator();
  double r1 = obj.add(50,4);
  System.out.println(r1);
  }
}
