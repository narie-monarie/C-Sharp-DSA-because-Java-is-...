import java.io.*;

public class App {

  public static int addNumbers(int num1, int num2) {
    return num1 + num2;
  }

  public static void main(String[] args) {
    // System.out.println("Hello");
    // String x = "Hello World";
    // char testGrade = 'A';
    // long age3 = 30L;

    // double gpa1 = 3.5;

    // System.out.println((int) gpa1);
    // System.out.println((double) 3);
    // int intFromString = Integer.parseInt("50");

    // System.out.println(100 + intFromString);

    // String greeting = "Hello";

    // System.out.println(greeting.length());
    // System.out.println(greeting.charAt(0));
    // System.out.println(greeting.indexOf("llo"));
    // //includes at index 1 and not at index 3
    // System.out.println(greeting.substring(1, 3));

    // Scanner sc = new Scanner(System.in);

    // String userName = sc.nextLine();
    // System.out.println("Hello, " + userName);

    // int[] luckyNumbers = new int[10];
    // // int[] luckyNumbers = { 4, 8, 25, 26, 23, 42 };
    // luckyNumbers[0] = 90;
    // System.out.println(luckyNumbers[1]);
    // // .Lenght is an attribute not a method
    // System.out.println(luckyNumbers.length);

    // int[][] numberGrid = { { 1, 2 }, { 3, 4 } };
    // numberGrid[0][1] = 99;

    // ArrayList<String> friends = new ArrayList<>();
    // friends.add("oscar");
    // friends.add("Sudi");
    // friends.add("Pascal");

    // for(String friend : friends){
    // System.out.println(friend);
    // }
    // System.out.println(addNumbers(2, 4));

    // BufferedWriter output = new BufferedWriter(
    // new OutputStreamWriter(System.out));
    // if ("dog".equals("cats")) {
    // output.write("True");
    // } else {
    // output.write("False");
    // }
    // output.flush();
    try {
      int division = 10 / 0;
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
