package LinkedList;

public class Main {
  class Node {
    int data; 
    Node next; 

   public Node (int data){
    this.data = data;
    this.next = null;
    }
  }

  public Node head = null;
  public Node tail = null;

  public void addNode(int data) {
    // create new Node
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  public void display(){
    Node current = head;
    if(head == null){
     

    System.out.println(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Main l = new Main();
    l.addNode(1);
    l.addNode(2);
    l.display();
  }
}
