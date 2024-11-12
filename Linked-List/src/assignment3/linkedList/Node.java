package assignment3;

public class Node {
    
    private int item;
    private Node next;

    // node constructor.
    public Node(int val) {
        this.item = val;
        this.next = null;
    }

    // sets the next node.
    public void setNext(Node nextN) {
        this.next = nextN;
    }

    // returns the next node.
    public Node getNext() {
        return next;
    }

    // returns the data of current node.
    public int getItem() {
        return item;
    }

}
