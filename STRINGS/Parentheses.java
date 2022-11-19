import java.util.Stack;

public class Parentheses {

  Stack<Integer> stack = new Stack<>();
  public Parentheses(){
    this.stack = new Stack<>();
  }
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.add(12);
    stack.add(1);
    stack.add(6);

    Integer min = stack.toArray();
    System.out.println(stack.size());
    for(int a : stack){
      min = Math.min(min, a);
    }
    System.out.println(min);
  }
}
