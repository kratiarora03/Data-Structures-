import java.util.Scanner;

public class LinkedLIst_question {
    static Node getNode(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = newNode.next = null;
        return newNode;
    }
    static Node sortedInsert(Node head, Node newNode)
    {
        Node current;
        if (head == null){
            head = newNode;
        }
        else if (head.data >= newNode.data)
        {
            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        }
        else
        {
            current = head;
            while (current.next != null && current.next.data < newNode.data){
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null){
                newNode.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        return head;
    }

    static void printList(Node head){
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Node head = null;
        Node new_node = getNode(8);
        head = sortedInsert(head, new_node);
        new_node = getNode(5);
        head = sortedInsert(head, new_node);
        new_node = getNode(3);
        head = sortedInsert(head, new_node);
        new_node = getNode(10);
        head = sortedInsert(head, new_node);
        new_node = getNode(12);
        head = sortedInsert(head, new_node);
        System.out.println("Old list: ");
        printList(head);
        System.out.println("\nEnter a integer to be inserted: ");
        int val= sc.nextInt();
        new_node = getNode(val);
        head = sortedInsert(head, new_node);
        System.out.println("New list: ");
        printList(head);
    }
}


