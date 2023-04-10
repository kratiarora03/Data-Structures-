import javax.swing.*;
import java.util.Scanner;

public class LinkedList6 {
    static Node head;
    public void insertathead(int data) {
        Node n1=new Node(data);
        n1.next=head;
        head=n1.next;
        head=n1;

    }
    public void print(Node<Integer> head ){
        while (head != null){
            System.out.print(head.data + "  ");
            head = head.next;

        }
        System.out.println();
    }

    public void delete(Node<Integer> head ,int data, int pos){
        Node<Integer> n1 = new Node<Integer>(data);
        Node<Integer> temp  = head ;
        int i = 1;
        while(i<pos-1){
            temp= temp.next;
        }
        temp.next= n1.next.prev;
        n1.next = temp.next;
        n1.next = null ;
        n1.prev = null ;

    }

    public static void main(String[] args) {
        LinkedList6 l1=new LinkedList6();
        l1.insertathead(10);
        l1.insertathead(20);
        l1.insertathead(30);
        l1.insertathead(40);
        l1.print(head);
        l1.delete(head,20,1);

    }
    }






