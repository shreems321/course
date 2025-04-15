

public class Array {
    public static void main(String a[]) 
    {
      int num[] = new int [5];
      num [0] = 8;
      num [1] = 4;
      num [2] = 3;
      num [3] = 20;
      num [4] = 10;
     // for (int i=0; i<5; i++)
     // {
        //for (int element : num)
      //System.out.println(num[i]);
      //System.out.println(element);

      //String student[] = new String [];  
     // }
      for (int n : num)
      {
        System.out.println(n);
      }

    }
  }