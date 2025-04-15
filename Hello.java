class Calculator
{
  int a;

  public int add(int n1,int n2)
  {
    int r = n1+n2;
    return r;
   
  }
  public void playMusic()
  {
    System.out.println("Playmusic");
  }
  public String getMeAPen(int cost)
  {
    if (cost<10)
    return "pen";
    else 
    return "pen not found";
  }
}

public class Hello
{
  public static void main(String args[])
  {
    int num1 = 4 ;
    int num2 = 5;
    int result = num1+num2;
    System.out.println(result);

    Calculator obj = new Calculator();
    Calculator obj1 = new Calculator();
    //Claculator obj2 = new Calculator();
    //int result = obj.add(num1,num2);
    String str = obj1.getMeAPen(9);
    obj1.playMusic();
   System.out.println(str);
    //System.out.println(result);

  }
}