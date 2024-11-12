package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class LinkedList {
    
    private Node head;
    private int count = -100; // count we add to list.

    // creates the linked list.
    public void construct(String fname) {
        BufferedReader r1 = null;
        try {
            r1 = new BufferedReader(new FileReader(fname));
            String line;
    
            /* Read each character one at a time, adding non space characters to a string builder,
            once we reach a space, it processes the number. */
            while ((line = r1.readLine()) != null) {
                int i = 0;
                StringBuilder num = new StringBuilder();
    
                while (i < line.length()) {
                    char newCharacter = line.charAt(i);
    
                    if (newCharacter == ' ') {
                        if (num.length() > 0) {
                            int val = Integer.parseInt(num.toString());
                            if (val > 0) {
                                tailInsert(val);
                            }
                            num.setLength(0);
                        }
                    } else {
                        num.append(newCharacter);
                    }
                    i++;
                }
    
                // In case there is a single number at the end.
                if (num.length() > 0) {
                    int val = Integer.parseInt(num.toString());
                    if (val > 0) {
                        tailInsert(val);
                    }
                }
            }
    
        // catches any thrown and closes the reader.
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (r1 != null) {
                try {
                    r1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }    

    /* navigates through each node of the linked list, it checks to see if the data of each
     * node satisfies the given condition. if it does, it removes the correct nodes and replaces it with
     * the count variable. */
    public void process() {
        Node curNode = head;
        Node prevNode = null;
    
        while (curNode.getNext() != null && curNode != null) {
            Node nextNode = curNode.getNext();
            if (nextNode.getItem() == curNode.getItem() * 2 + 7) {
                Node newNode = new Node(count);
                count++;
                if (prevNode == null) {
                    head = newNode;
                } else {
                    prevNode.setNext(newNode);
                }
                newNode.setNext(nextNode.getNext());
                curNode = newNode;
            } else {
                prevNode = curNode;
                curNode = nextNode;
            }
        }
    
        // checks to see if the last node data is negative or null.
        if (curNode == null || curNode.getItem() > 0) {
            tailInsert(count);
        }
    }
    
    // regular tail insertion for linked list.
    public void tailInsert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    /* creates a file where all of the output is. goes through each node
     * and writes the data stored. */
    public void createFile(String fname) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(fname);
            Node curNode = head;
            while (curNode != null) {
                writer.write(curNode.getItem() + (curNode.getNext() != null ? " " : ""));
                curNode = curNode.getNext();
            }
        // catches any thrown and closes the writer
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
} 