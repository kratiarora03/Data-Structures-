public class ll_stack {

        Node head;
        class Node{
            int data;
            int size;
            Node next;
            Node(int data){
                this.data=data;
                this.size=0;
                this.next=null;
            }


        }
        public void push(int data){
            Node n=new Node(data);
            if(head==null){
                head=n;
            }
            else{
                n.next=head;
                head=n;
            }
        }
        public int pop(){
            int top=head.data;
            return top;
        }
        public int peek(){
            if(head==null){
                return -1;
            }
            else{
                int top=head.data;
                head=head.next;
                return top;

            }

        }
        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            else {
                return false;
            }
        }

        public static void main(String[] args) {
            ll_stack st=new ll_stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            System.out.println("Element at the top of stack: "+ st.peek());
            st.pop();
            System.out.println("Element at the top after pop: "+ st.peek());
            System.out.println(st.isEmpty());
        }
    }

