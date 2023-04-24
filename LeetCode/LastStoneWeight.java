import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LastStoneWeight {
  public static void main(String[] args) {
    Integer[] stones = { 2, 7, 4, 1, 8, 1 };

    List<Integer> list = new ArrayList<Integer>(Arrays.asList(stones));
    list.sort(Comparator.naturalOrder());
    Collections.reverse(list);
    Integer b = 0;
    Integer c = 1;
    Integer d = 0;
    for (int i = 0; i < list.size() - 1; i++) {
      if (stones[b] > stones[c]) {
        d = stones[b] - stones[c];
        list.add(d);
        list.remove(b);
        list.remove(c);
      }
      c++;
      b++;
    }
    System.out.println(list);
  }
}
