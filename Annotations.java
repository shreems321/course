class A{
    public void showTheOneBelongsToClass()
    {
      System.out.println("in A show");
    }
  }
  class B extends  A
  {
    @Override
    public void showTheOneBelongsToClass()
    {
      System.out.println("in B show");
    }
  }
  public class Annotations{
      public static void main(String a[])
     {
      B obj = new B();
      obj.showTheOneBelongsToClass();
     }
    }
  
  