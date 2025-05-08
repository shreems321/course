
public class MultiInh
{
    public static void main(String a[])
    {
      SciCalc obj = new SciCalc();
      int r1 = obj.add(2,5);
      int r2 = obj.sub(10,4);
      int r3 = obj.multi(5,4);
      int r4 = obj.div(10,4);
      double r5 = obj.power(4,2);
    
      System.out.println(r1 + " " +r2 + " " + r3 + " " + r4 + " " +r5);

    }
   
}
    
-----

public class Calc  {
  
   
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}
 
--------

public class AdvCalc extends Calc{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

---------

public class SciCalc extends AdvCalc{
    public double power(int n1,int n2)
    {
        return Math.pow(n1,n2);
    }
}