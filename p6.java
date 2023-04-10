public class p6 {
    static Node head;
    Node tail;

    public class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    // TO INSERT AT HEAD
    public void insertathead(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
        }
        else{
            tail.next=n1;
        }
        tail=n1;
        tail.next=head;
    }
    //TO INSERT A NODE AT TAIL
    public void insertattail(int data){
        Node n1=new Node(data);
        tail.next=n1;
        tail=n1;
        n1.next=head;
    }
    // TO DELETE A NODE FROM HEAD
    public void removefromhead(){
        head=head.next;
        tail.next=head;
    }
    // TO REMOVE A NODE FROM TAIL
    public void removefromtail(){
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
        temp=tail;
    }
    //TO PRINT A CIRCULAR LL
    public void print(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        p6 l1=new p6();
        System.out.print("INSERTION AT BEGIN : ");
        l1.insertathead(69);
        l1.insertathead(84);
        l1.print();
        System.out.print("INSERTION AT END : ");
        l1.insertattail(90);
        l1.print();
        System.out.print("DELETION AT BEGIN : ");
        l1.removefromhead();
        l1.print();
        System.out.print("DELETION AT END : ");
        l1.removefromtail();
        l1.print();

    }
}

