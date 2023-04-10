public class stack_implement_with_array {
    int top;
    int stack[];

    //constructor
    public stack_implement_with_array(int size){
        stack = new int[size];
        top = -1;    // when stack is empty
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else return false;
    }
    public void push(int data){
        if(isEmpty()){
            System.out.println("stack is empty");
        } stack[++top]= data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("pop elements out");
            return -1;
        }
        return stack[top --];

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("from top");
            return -1;
        }
        return stack[top];
    }

    public void printStackTrace() {
        System.out.print("[ ");
        for(int i = top; i>=0; i--)
            System.out.print(stack[i]+" ");
        System.out.println("]");

    }


    public static void main(String[] args) {
        stack_implement_with_array st = new stack_implement_with_array(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Element at top of stack: "+ st.peek());
        st.pop();
        System.out.println("Element at top after pop: "+ st.peek());
        System.out.println(st.isEmpty());
        }


    }



