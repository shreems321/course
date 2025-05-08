enum Status{
    Running, Failed, pending, success
  }
  
  public class Enume
  {
      public static void main(String a[])
      
     {
        Status[] ss = Status.values();
       
        for (Status s : ss)
        {
          System.out.println(s +" : " + s.ordinal() );
        }
  
      
  
     }
  }
  
