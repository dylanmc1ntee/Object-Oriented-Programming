package assignment3;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); // creates new linked list.
        l1.construct("data.txt"); // populates the list with the data from file.
        l1.process(); // goes through list, applying condition.
        l1.createFile("processed.txt"); // creates output.
    }
}
