public class FindMajority {
  public static int findMajCandidate(Integer[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }
    Integer maj = arr[0], count = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == maj) {
        count++;
      } else {
        count--;
      }

      if (count == 0) {
        maj = arr[i];
        count = 1;
      }
    }
    return maj;
  }

  public static void main(String[] args) {
    Integer[] nums = { 3, 2, 2, 1, 2, 2, 1 };
    System.out.println(findMajCandidate(nums));
  }
}
