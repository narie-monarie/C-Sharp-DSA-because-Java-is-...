public class ArrUb {
  static int arrsubtractions(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        sum += nums[i];
      } else {
        sum -= nums[i];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    System.out.println(arrsubtractions(nums));
  }
}
