
/*
* Have to figure out all of the possible ways to go up the stairs using one, two or three hops
*/

public class TripleStep {

  // params is the amount of stairs 
  public static int ways(int stairs) {
    if (n < 0) {
      return 0;
    } else if (n == 0) {
      return 1;
    } else {
      return ways(n - 1) + ways(n - 2) + ways(n - 3);
    }
  }

  public static void main(String args[]) {

  }
}