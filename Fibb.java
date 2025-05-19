import javax.sound.sampled.SourceDataLine;

public class Fibb {
 public static int fib(int n) 
 {
    if (n == 1 || n == 2)
     return 1;
     return fib(n-1)+fib(n-2);
    
}
    public static void main(String[] a){

  int n =11;
  System.out.println("fibonacchi number " + n + "is" + fib(n));

    }
}
/*public class Fibb {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}*/
