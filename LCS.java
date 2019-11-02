/*
* Finds the longest common subsequence
* Have to break the problem down into subproblems
* The subproblem is compare one index to the beginning of the first index
* Keep track of the longest sequence
*/

public class LCS {

  private static int longest = 0;

  // public call for finding the longest subsequence recursively
  public static int find(String s1, String s2) {
    
    // calling the recursive function
    return find(s1, s2, s1.length(), s2.length());
  }

  // finds the subsequence recursively 
  private static int find(String s1, String s2, int i, int j) {
    
    //null case
    if (i == 0 || j == 0) {
      return 0;
    }

    // test if the last character of each string match
    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
      return find(s1, s2, i - 1, j - 1) + 1;
    }

    return Integer.max(find(s1, s2, i - 1, j), find(s1, s2, i, j - 1));


  }

  public static void main(String[] args) {
    System.out.println(find("ABCBDAB", "BDCABA"));
  }
}