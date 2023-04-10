public class Node<Integer> {
    int data ;

    Node<Integer> next ;
    Node<Integer> prev ;

    Node(int data){
        this.data= data ;
        next=null;
        prev = null ;
    }


    public Node() {

    }
}