public class Main {
  static boolean anagrams(String s, String y) {
    if (s.length() != y.length())
      return false;
    StringBuilder bob = new StringBuilder<>();
    for (int i = y.length() - 1; i >= 0; i--) {
      bob.append(i);
    }

    if (bob.toString() == s)
      return true;

    return false;
  }
  public static void main(String[] args) {
    System.out.println(anagrams("restful", "lufster"));
  }
}
