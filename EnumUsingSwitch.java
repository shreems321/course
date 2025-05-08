enum Status{
    Running, Failed, pending, success
  }
  
  public class EnumUsingSwitch
  {
      public static void main(String a[])
      
     {
      Status s = Status.success;
      switch (s)
      {
  
      case Running:
      
        System.out.println("good");
        break;
      
      case Failed:
      
        System.out.println("bad");
        break;
      
      case pending:
      
        System.out.println("in pending");
        break;
      
     default:
      
        System.out.println("done");
  
      
  
    }
  
      if (s == Status.Running)
      System.out.println("good");
     else if (s == Status.Failed)
        System.out.println("not good");
    else if(s == Status.pending)
      System.out.println("in pending");
    else 
      System.out.println("done");
  
  
     }
  }
  