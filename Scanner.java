import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketPermission;
import java.util.Scanner;

public class Scanner
{
  
  public static void main(String a[]) throws IOException
  {
    System.out.println("enter the number");
  //   InputStreamReader in = new InputStreamReader(System.in);
  //  BufferedReader bf = new BufferedReader(in);

  Scanner sc = new Scanner(System.in);
   
   int num = sc.nextInt();
   System.out.println(num);
   
  }
}   

