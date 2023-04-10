public class QUEUE {

    static int arr[];
    static int size;
    static int rear = -1;


    public QUEUE(int n) {
        arr = new int[n];
        this.size = n;
        System.out.println("enter the elements :");

    }

    public boolean isEmpty() {

        return rear == -1;
    }

     void add(int data) {
        if (rear == size - 1) {
            System.out.println("full queue");
            return;
        }
        rear++;
        arr[rear] = data;

    }

     int remove() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

     int peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
    }


    public static void main(String[] args) {
        QUEUE q1 = new QUEUE(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);

            System.out.println(q1.peek());
            q1.remove();
            System.out.println(q1.peek());

    }
}








