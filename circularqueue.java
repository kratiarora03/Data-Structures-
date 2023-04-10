public class circularqueue {
   static int arr[];
   static int size;
   static int rear = -1;
   static int front = -1;

    public circularqueue (int n) {
        arr = new int[n];
        this.size = n;
        System.out.println("enter the elements :");

    }

    boolean isEmpty(){
         return rear == -1 && front == -1;

   }
    boolean isFull(){
        return (rear +1 )% size == front;
   }

    void add(int data){
        if(isFull()){
            System.out.println("the queue is full");
            return;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
   }

    int remove(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;

        }
        int result = arr[rear];
        if(front == rear){
            rear = front = -1;
        }else{
            front = (front+1)%size;
        }
          return result;
   }

    int peek(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }
        return arr[front];
   }

    public static void main(String[] args) {
        circularqueue q1 = new circularqueue(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println(q1.remove());
        q1.add(60);
        System.out.println(q1.remove());
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }


    }




   }
