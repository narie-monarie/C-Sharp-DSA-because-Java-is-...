package LINKEDLISTS;

public class SinglyLinkedList {
public ListNode head;
public ListNode tail;

public SinglyLinkedList() {
head = new ListNode(0);
tail = head;
}

public void append(int val) {
tail.next = new ListNode(val);
tail = tail.next;
}

public void prepend(int val){
ListNode curr = new ListNode(val);
curr.next = head;
}

public void printList(){
ListNode curr = head.next;
while(curr!=null){
System.out.print(curr.val + "->");
curr = curr.next;
}
}
public static void main(String[] args) {
SinglyLinkedList s = new SinglyLinkedList();
s.append(12);
s.prepend(13);
s.printList();
}
}
