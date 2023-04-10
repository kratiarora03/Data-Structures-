public class stackarray {
    private final int size;
    int arr[];
    int top;


    stackarray(int size) {
        this.size = size;
        arr = new int[size];
        this.top = -1;

    }

    public void push(int data) {
        if (this.size - this.top > 1) {
            this.top++;
            arr[this.top] = data;
        } else {
            System.out.println("Stack is overflow");
        }
    }

    void pop() {
        if (this.top >= 0) {
            --this.top;
        } else {
            System.out.println("Stack is Underflow");

        }

    }

    public int peek(){
        if(this.top>=0){
            return arr[this.top];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        if(this.top==-1){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        stackarray st=new stackarray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Element at top of stack: "+ st.peek());
        st.pop();
        System.out.println("Element at top after pop: "+ st.peek());
        System.out.println(st.isEmpty());
    }

}
