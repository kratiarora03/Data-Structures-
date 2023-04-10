import java.util.Scanner;

public class LinkedList4 {
    static Node head;
    public void imsertathead(int data){
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

    public void insert ( Node<Integer> head , int data , int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        int i = 0 ;
        Node<Integer> temp = head ;
        while( i <pos -1 ){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void DeletionAtHead(Node<Integer> head , int data, int pos  ){
        Node<Integer> newNode = new Node<Integer>(data);
        int i = 0 ;
        Node<Integer> temp = head ;
        while( i <pos -1 ){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next.prev;
        temp.next.next = temp.next ;



    }




    public static void main(String[] args) {
         LinkedList4 l1=new LinkedList4();
         l1.imsertathead(10);
         l1.imsertathead(20);
         l1.imsertathead(30);
         l1.print(head);
         l1.insert(head,35,3);
         l1.print(head);
    }

}
