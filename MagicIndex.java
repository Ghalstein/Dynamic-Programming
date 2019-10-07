/*
* Finds if present a number in a sorted array that is equal to its index
*/

public class MagicIndex {

  private static int find(int[] arr, int l, int m, int h) {
    if (mid == arr[mid])
      return mid;
    else if (h < l) {
      return -1;
    } else if (mid > arr[mid]) {
      h = m - 1;
      m = l + (h + l) / 2;
      return find(arr, l, m, h);
    } else if (mid < arr[mid]) {
      l = m + 1;
      m = l + (h + l) / 2;
      return find(arr, l, m, h);
    }
  }

  public static int find(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    int mid = low + (high + low) / 2;

    return find(arr, low, mid, high);
  }

  public static void main(String[] args) {

  }
}