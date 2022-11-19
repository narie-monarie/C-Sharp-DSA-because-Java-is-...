public class Main {
  // Binary Search
  static int Binary(int arr[], int target) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int mid = (l + r) / 2;
      if (target > arr[mid]) {
        l = mid + 1;
      } else if (arr[mid] > target) {
        r = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = {1,45,56,3,2,54,56,67,34};
    System.out.println(Binary(arr, 56));
  }
}
