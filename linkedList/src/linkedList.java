import java.util.ArrayList;

public class linkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //Insert element at the beginning in a linked list
    public void insertBeg(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        return;
    }

    //Insert element at any position in a linked list
    public void insertAfterNode(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println("The previous node cannot contain null value");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        return;
    }

    //Insert element at the end in a linked list
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    //Function To Delete an element in a linked list
    public void deleteAt(int index) {
        //Linked list is empty
        if (head == null) {
            return;
        }
        Node temp = head;
        //Deletion at Beginning
        if (index == 0) {
            head = temp.next;
            return;
        }
        // Deletion other than beginning
        for (int i = 0;/*temp!=null&&*/ i < index - 1; i++) {
            temp = temp.next;
         /* if(temp==null&&temp.next==null)
          {
              return;
          }*/
        }
        temp.next = temp.next.next;
        return;
    }

    //Function to revese a linked list element Iteratively
    void reverseLinkedList() {
        Node curr = head;
        Node next = null;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Function to reverse Linked List recursively
    public void reverseRec(Node curr, Node Prev) {
        //If current at last node
        if (curr.next == null) {
            head = curr;
            curr.next = Prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next = Prev;
        reverseRec(nextPtr, curr);
    }

    //Function to find Middle of Linked list
    public void middleLL() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    //Function to detect cycle in a Linked List
    public void cycleLL() {
        Node slow = head;
        Node fast = head;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Loop is not Detected in a Linked List");
        } else {
            System.out.println("Loop is Detected in a Linked List");
        }
    }

    //To Display Linked list Element
    public void displayLinkedList() {
        ArrayList al = new ArrayList();
        Node current = head;
        while (current != null) {
            al.add(current.data + " ");
            current = current.next;
        }
        System.out.println(al);
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        System.out.println("Original list Before Insertion");
        list.displayLinkedList();
        System.out.println("After insertion at the end");
        list.insertAtEnd(10);
        list.insertAtEnd(12);
        list.displayLinkedList();
        System.out.println("After Insertion at the Beginning");
        list.insertBeg(1);
        list.displayLinkedList();
        System.out.println("Insertion after a Node");
        list.insertAfterNode(list.head.next.next, 6);
        list.displayLinkedList();
        list.deleteAt(0);
        System.out.println("After deletion first element ");
        list.displayLinkedList();
        //list.reverseLinkedList();
        //System.out.println("Linked list element after reversal");
        //list.displayLinkedList();
        list.reverseRec(list.head, null);
        System.out.println("Linked list element after reversal");
        list.displayLinkedList();
        System.out.print("Middle element of Linked list is : ");
        list.middleLL();
        //Making circular Linked List
        Node temp = list.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list.head;
        list.cycleLL();


    }
}