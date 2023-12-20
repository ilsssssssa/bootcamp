public class Node {
  private int value;

  private Node prev;

  private Node next; // stores the object reference of another Node object

  public Node(int value) {
    this.value = value;
  }

  public void setPrev(Node node) {
    this.prev = node;
  }

  public void setNext(Node node) {
    this.next = node;
    if(node != null)
    node.setPrev(this);
  }

  public Node prev() {
    return this.prev;
  }

  public Node next() {
    return this.next;
  }

  public int getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Node head = new Node(100);
    Node node1 = new Node(101);
    head.setNext(node1);
    node1.setNext(new Node(102));

    System.out.println(head.next().next().getValue()); // 102
    // node1 cannot find the ref of head object. if there is no prev attribute屬性

    // after adding "prev" attribute屬性, node1 will be able to find the previous node (head)
    System.out.println(head.next().next().prev().getValue()); // 101
  }
}
