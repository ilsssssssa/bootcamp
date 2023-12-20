public class LinkedList {

  private Node head;

  public LinkedList() {

  }

  public void add(int value) {
    if (head == null) { // 表示是空的
      head = new Node(value); // 創建一個新的head
      return;
    }
    // while loop until tail, than setNext() // current= 目前的
    Node current = this.head;
    while (current.next() != null) {
      current = current.next();
    }
    current.setNext(new Node(value));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LinkedList[");
    Node curNode = this.head;
    while (curNode != null) {
      sb.append(curNode.getValue()).append(", ");
      curNode = curNode.next();
    }
    return sb.append("]").toString();
  }

  // remove(int value)
  public void remove(int value) {
    // Early Return
    if (this.head == null) {
      return;
    }
    Node curNode = this.head;
    while (curNode != null) {
      if (curNode.getValue() == value) {
        Node prevNode = curNode.prev();
        if (prevNode != null) {
          Node nextNode = curNode.next();
          prevNode.setNext(nextNode);
          if (nextNode != null) {
            nextNode.setPrev(prevNode);
          }
        } else {
          this.head = curNode.next();
          if (this.head != null) {
            this.head.setPrev(null);
          }
        }
      }
      curNode = curNode.next();
    }
  }

  public static void main(String[] args) {
    LinkedList l1 = new LinkedList();
    System.out.println(l1.toString()); // LinkedList[]
    l1.add(3);
    System.out.println(l1.toString()); // LinkedList[3, ]
    l1.add(100);
    System.out.println(l1.toString()); // LinkedList[3, 100, ]
    l1.add(150);
    System.out.println(l1.toString()); // LinkedList[3, 100, 150, ]
    l1.remove(100);
    System.out.println(l1.toString()); // LinkedList[3, 150, ]
    l1.remove(150);
    System.out.println(l1.toString());
    l1.remove(3);
    System.out.println(l1.toString());
  }
}
