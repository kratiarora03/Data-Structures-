public class binary_search_tree {


    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public binary_search_tree() {
        root = null;
    }


    public void insert(int data) {

        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        } else {

            Node current = root, parent = null;

            while (true) {

                parent = current;


                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void inorderTraversal(Node node) {


        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }

    public static void main (String[]args){
            binary_search_tree bt = new binary_search_tree();

            bt.insert(50);
            bt.insert(30);
            bt.insert(70);
            bt.insert(60);
            bt.insert(10);
            bt.insert(90);
        System.out.println("Binary search tree after insertion:");
        //Displays the binary tree
        bt.inorderTraversal(bt.root);


    }
    }

