
/*
* Have to figure out all of the possible ways to go up the stairs using one, two or three hops
*/

import java.util.*;

public class TripleStep {

  // params is the amount of stairs -- solution w/out memoization
  public static int ways(int n) {
    if (n < 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else {
      return ways(n - 1) + ways(n - 2) + ways(n - 3);
    }
  }

  // w/ memoization
  public static int memWays(int n) {
    int[] memo = new int[n + 1];
    Arrays.fill(memo, -1);
    return memWays(n, memo);
  }

  private static int memWays(int n, int[] memo) {
    if (n < 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else if (memo[n] > -1) {
      return memo[n];
    } else {
      memo[n] = memWays(n - 1, memo) + memWays(n - 2, memo) + memWays(n - 3, memo);
      return memo[n];
    }
  }

  public static void main(String args[]) {
    System.out.println(memWays(5));
  }
}