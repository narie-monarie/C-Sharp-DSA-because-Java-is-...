class Ints {

  static int ret(int a) {
    return a ^ a;
  }

  public static void main(String[] args) {
    double a = 12;
    System.out.println(ret(7));
    System.out.println((int) a);
  }
}
