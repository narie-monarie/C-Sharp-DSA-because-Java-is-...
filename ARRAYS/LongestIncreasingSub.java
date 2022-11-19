public class LongestIncreasingSub {
  static int lengthOfLIS(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int n = nums.length;
    int[] dp = new int[n];
    dp[0] = 1;
    int max = 1;
    for (int i = 1; i < n; i++) {
      int prevMax = 0;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          prevMax = Math.max(dp[j], prevMax);
        }
      }
      dp[i] = prevMax + 1;
      max = Math.max(dp[i], max);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, -1, 0, 6, 2, 3 };
    System.out.print(lengthOfLIS(nums));
  }
}
