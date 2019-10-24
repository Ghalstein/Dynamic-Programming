/*
Imagine a robot sitting on the upper left corner of grid 
with r rows and c columns. The robot can only move in two 
directions, right and down, but certain cells are "off limits" 
such that the robot cannot step on them. Design an algorithm to 
find a path for the robot from the top left to the bottom right.
*/

import java.util.*;

public class RobotInGrid {

  // takes in a boolean matrix and decides if theres a path to other side

  // recrusive call

  private static boolean pathFound = false;

  public static boolean isPath(boolean[][] matrix) {

    // private recursive function for moving postion
    isPath(matrix, 0, 0);
    return pathFound;
  }

  // recursive function for moving position
  private static void isPath(boolean[][] matrix, int x, int y) {
    if (x == matrix.length - 1 && y == matrix[0].length - 1) {
      pathFound = true;
      return;
    }
    if (matrix[y][x]) {
      if (x < matrix[0].length - 1)
        isPath(matrix, y, x + 1);
      if (y < matrix.length - 1)
        isPath(matrix, y + 1, x);
    }
  }

  public static void main(String[] args) {
    boolean[][] matrix = new boolean[2][3];
    matrix[0][0] = true;
    matrix[0][0] = true;
    matrix[1][0] = true;
    matrix[1][1] = true;
    matrix[1][2] = true;
    System.out.println(Arrays.deepToString(matrix));
    System.out.println(isPath(matrix));
  }
}