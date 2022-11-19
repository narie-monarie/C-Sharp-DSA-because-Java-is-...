import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
  static void toThat() {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    while (a != 0) {
      int b = sc.nextInt(), c = sc.nextInt();
      int num = Math.abs(b - c);
      int ans = num / 10;
      if (num % 10 != 0)
        ans++;
      System.out.println(ans);
      a--;
    }
  }

  public static void main(String[] args) {
    toThat();
  }
}
