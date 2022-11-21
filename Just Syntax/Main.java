public class Main {

  //static means that the method belongs to the Main class and not an object of the Main class
  static int myMethod(){
    return 2;
  }
  public static void main(String[] args) {
    // System.out.println("Hello Java");
    // char myVar = 65, MyVar2 = 66;
    // System.out.println(myVar);
    // System.out.println(myVar22);

    // int myInt = 9;
    // double myDouble = myInt;

    // double a = 9.78d;
    // int i = (int) a;

    // System.out.println(i);
    // System.out.println(myInt);
    // System.out.println(myDouble);

    // String tx = "Hello Monari";

    // System.out.println(tx.isBlank());

    String[] cars = { "volvo", "BMW", "Mazda" };

    for (String car : cars) {
      System.out.println(car);
    }


     System.out.println(myMethod());
  }
}
