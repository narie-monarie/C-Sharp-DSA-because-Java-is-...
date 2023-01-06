import java.util.Arrays;

public class Anagrams {
  static boolean anagrams(String s, String y) {
    if (s.length() != y.length()) {
	  return false;
	}
    char one[] = s.toLowerCase().toCharArray();
    char two[] = y.toLowerCase().toCharArray();
    Arrays.sort(one);
    Arrays.sort(two);
    boolean status = Arrays.equals(one, two);
    if (status) {
	  return true;
    }
    return false;
  }
 public static void main(String[] args) {
   System.out.println(anagrams("restful", "fluster"));
 }
}
