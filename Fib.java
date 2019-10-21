import java.util.*;

public class Fib {

  // dynamically create the recrusive algorithm for Fibonacci Seq

  // stores the past calcualted fib values
  private static Map<Integer, Integer> map = new HashMap<>();

  // runs the fib seq based on int input
  public static int calc(int n) {
    if (n < 1)
      return 0;

    if (n == 1)
      return 1;

    if (map.containsKey(n)) {
      return map.get(n);
    } else {
      map.put(n, calc(n - 1) + calc(n - 2));
      return map.get(n);
    }
  }

  public static void main(String[] args) {
    System.out.println(calc(30));
  }
}