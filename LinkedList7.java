public class LinkedList7 {
    static Node head;
    static Node Tail;

    public void InsertAtHead(int data) {
        Node n1 = new Node(data);
        if(head == null ){
            head = n1;
            Tail = n1;
        }
        Tail.next = n1;
        Tail = n1;
        Tail.next = head ;
    }

    public void InsetAtPosition ( Node<Integer> head , int data, int pos ){
        Node<Integer> newNode = new Node<Integer>(data);
        int i = 0 ;
        Node<Integer> temp = head ;
        while( i <pos -1 ){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
//        temp.next = newNode;
//        newNode = temp.next.next;


        }





    public void print(Node<Integer> head) {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            do{
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }

    }




    public static void main(String[] args) {
        LinkedList7 l1 = new LinkedList7();
        l1.print(head);
        l1.InsertAtHead(30);
        l1.InsertAtHead(40);
        l1.print(head);
        l1.InsetAtPosition(head , 40,2);
        l1.print(head);



    }
}

