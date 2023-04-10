import java.util.Scanner;

public class p4{
    static Node head;
    public class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //Insertion At the beginning
    public void insert_at_begin(int data){
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }
    //Insertion At the end
    public void insert_at_end(int data){
        Node n1=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        n1.next=null;
        temp.next=n1;
    }
    //Insertion At a specific location
    public void Insertion_at_specific(int pos,int data){
        Node temp=head;
        int count=1;


        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        Node n1=new Node(data);
        n1.next=temp.next;
        temp.next=n1;
    }
    //Deletion At the beginning
    public void deletion_at_begin(){
        if(head==null)
            return;
        head=head.next;
    }
    //Deletion At the End
    public void deletion_at_end(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    //Deletion At a specific location
    public void delete_at_pos(int pos){
        Node temp=head;
        if (pos == 0) {
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null&&i<pos-1;i++){
            temp=temp.next;
        }
        Node next=temp.next.next;
        temp.next=next;
    }
    // TO PRINT THE LL
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void method(){
        p4 a=new p4();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.INSERTION AT BEGINNING");
        System.out.println("2.INSERTION AT END");
        System.out.println("3.INSERTION AT SPECIFIC POSTION");
        System.out.println("4.DELETION AT BEGINNING");
        System.out.println("5.DELETION AT END");
        System.out.println("6.DELETION AT SPECIFIC POSTION");
        System.out.println();
        System.out.print("ENTER THE CHOICE : ");
        int n=sc.nextInt();
        int data=0;
        if(n==1){
            System.out.print("ENTER THE DATA TO INSERT : ");
            data=sc.nextInt();
        }
        else if(n==2){
            System.out.print("ENTER THE DATA TO INSERT : ");
            data=sc.nextInt();
        }
        else if(n==3){
            System.out.print("ENTER THE DATA TO INSERT : ");
            data=sc.nextInt();
        }

        switch(n){
            case 1:
                a.insert_at_begin(data);
                break;


            case 2:
                a.insert_at_end(data);
                break;


            case 3:
                System.out.print("ENTER THE POSTION : ");
                int pos=sc.nextInt();
                a.Insertion_at_specific(pos, data);
                break;


            case 4:
                a.deletion_at_begin();
                break;


            case 5:
                a.deletion_at_end();
                break;


            case 6:
                System.out.print("ENTER THE POSTION : ");
                int pos2=sc.nextInt();
                a.Insertion_at_specific(pos2, data);
                break;
        }
        a.print(head);
    }
    public static void main(String[] args) {
        p4 a=new p4();
        Scanner sc=new Scanner(System.in);
        a.insert_at_begin(45);
        a.insert_at_begin(34);
        a.insert_at_begin(23);
        System.out.println();
        System.out.print("INTIAL LINKED LIST IS : ");
        a.print(head);
        System.out.println();
        a.method();
        System.out.print("WANT TO PERFORM MORE OPERATIONS  Y(1)/N(0) : ");
        int input=sc.nextInt();
        if(input==1){
            a.method();
        }
        else{
            System.out.println("EXIT !! ");
        }
    }
}





