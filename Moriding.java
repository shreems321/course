
class Calc 

{  
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
   
}
class AdvCalc extends Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2 +10;
    }
}


public class Moriding
{
    public static void main(String a[])
    {
      AdvCalc obj = new AdvCalc();
      int r1 = obj.add(2,5);
     
    
      System.out.println(r1 );

    }
   
}  
