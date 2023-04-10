public class p5{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;


        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    //Insertion At the beginning
    public void insert_at_begin(int data){
        Node n1=new Node(data);
        n1.next=head;
        if(head!=null){
            head.prev=n1;
        }
        head=n1;
    }
    //Insertion At the end
    public void insert_at_end(int data){
        Node n1=new Node(data);
        Node temp=head;
        if(head==null){
            head=n1;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        n1.prev=temp;
        temp.next=n1;
    }
    // TO INSERT AT SPECIFIC POS
    public void insertat(Node prev,int data){
        if(prev==null){
            return;
        }
        Node n1=new Node(data);
        n1.next=prev.next;
        prev.next=n1;
        n1.prev=prev;
    }
    // TO DELETE A NODE FROM HEAD
    public void removefromhead(){
        Node temp=head;
        temp=temp.next;
        temp.prev=null;
        head=temp;
    }
    // TO DELETE A NODE FROM TAIL
    public void removefromtail(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    // TO DELETE A NODE FROM POS
    public void removefrom(int pos){
        Node temp=head;
        if (pos == 0) {
            head = temp.next;
            return;
        }
        for(int i=1;temp!=null&&i<pos-1;i++){
            temp=temp.next;
        }
        Node next=temp.next.next;
        temp.next=next;


    }
    // TO PRINT THE LINKEDLIST USING TRAVERSAL
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        p5 l1=new p5();
        System.out.print("INSERTION AT BEGIN : ");
        l1.insert_at_begin(25);
        l1.insert_at_begin(84);
        l1.insert_at_begin(90);
        l1.print();
        System.out.print("INSERTION AT END : ");
        l1.insert_at_end(23);
        l1.insert_at_end(78);
        l1.print();
        System.out.print("INSERTION AT SPECIFIC POSTION : ");
        l1.insertat(l1.head.next.next,28);
        l1.print();
        System.out.print("DELETION AT BEGIN : ");
        l1.removefromhead();
        l1.print();
        System.out.print("DELETION AT END : ");
        l1.removefromtail();
        l1.print();
        System.out.print("DELETION AT SPECIFIC POSTION : ");
        l1.removefrom(3);
        l1.print();
    }
}

