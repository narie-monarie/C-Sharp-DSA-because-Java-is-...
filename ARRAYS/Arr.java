import java.util.ArrayList;
import java.util.Collections;

public class Arr {
  public static void main(String[] args) {
    ArrayList<Integer> v = new ArrayList<Integer>();
    // System.out.println(arr.length);
    // String c = "hello world ";
    // String []z = c.split(" ");
    // System.out.println(z[z.length -1].length());
    v.remove(3);
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int m = 3;
    int n = 3;

    for (int a : nums1)
      if (nums1.length <= m)
        v.add(a);

    for (int b : nums2)
      if (nums2.length <= n)
        v.add(b);

    Collections.sort(v);

    for (int c : v)
      System.out.print(c);
  }
}
