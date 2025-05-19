/* 
import java.io.IOException;
import java.net.SocketPermission;

public class BufferReader
{
  
  public static void main(String a[]) throws IOException
  {
    System.out.println("enter the number");
   int num = System.in.read();
   System.out.println(num-48);
  }
}   
*/

---------------------------------------------------------------------------------------
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketPermission;

public class BufferReader
{
  
  public static void main(String a[]) throws IOException
  {
    System.out.println("enter the number");
    InputStreamReader in = new InputStreamReader(System.in);
   BufferedReader bf = new BufferedReader(in);
   
   int num = Integer.parseInt(bf.readLine());
   System.out.println(num);
   bf.close();
  }
}   

