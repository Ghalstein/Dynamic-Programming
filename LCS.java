/*
* Finds the longest common subsequence
* Have to break the problem down into subproblems
* The subproblem is compare one index to the beginning of the first index
* Keep track of the longest sequence
*/



public class LCS {

  // finds the longest subsequence
  public static int find(String s1, String s2) {

    int longest = 0;

    // iterate through s1 and find whether s2 has equal char for each index
    int i = 0;
    while (i < s1.length()) {
      int curr2 = 0;
      int curr1 = i;
      int relLongest = 0;
      while (curr2 < s2.length()) {
        if (s1.charAt(curr1) == s2.charAt(curr2)) {
          ++relLongest;
          if (relLongest > longest)
            longest = relLongest;
        }
      }
      ++i;
    }
  }

  public static void main(String[] args) {

  }
}