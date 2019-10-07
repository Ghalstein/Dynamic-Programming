/*
* Finds if present a number in a sorted array that is equal to its index
*/

public class MagicIndex {

  private static int find(int[] arr, int l, int m, int h) {
    if (m == arr[m])
      return m;
    else if (h < l) {
      return -1;
    } else if (m > arr[m]) {
      h = m - 1;
      m = (h + l) / 2;
      return find(arr, l, m, h);
    } else if (m < arr[m]) {
      l = m + 1;
      m = (h + l) / 2;
      return find(arr, l, m, h);
    }
    return -1;
  }

  public static int find(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    int mid = (high + low) / 2;

    return find(arr, low, mid, high);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11};
    int[] arr1 = {0, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 11};

    System.out.println(find(arr));
    System.out.println(find(arr1));

  }
}