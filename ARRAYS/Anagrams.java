public class Anagrams {
	static boolean anagrams(String s, String y) {
		if (s.length() != y.length())
			return false;
		StringBuilder bob = new StringBuilder();
		String x = "1";
		Int v = Integer.parseInt(x);
		System.out.println(Integer.toBinaryString(Integer.parseInt(x)));
		for (int i = y.length() - 1; i >= 0; i--) {
			bob.append(i);
		}

		if (y == s)
			return true;

		return false;
	}

	public static void main(String[] args) {
		System.out.println(anagrams("restful", "fluster"));
	}
}
