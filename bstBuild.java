public class bstBuild {
     static class Node {
         int data;
         Node left;
         Node right;

         Node(int data) {
             this.data = data;
             this.left = null;
             this.right = null;
         }

          static Node insert(Node root, int value) {
             if (root == null) {
                 root = new Node(value);
             }
             if (root.data > value) {
                 root.left = insert(root.left, value);
             }
             if (root.data < value) {
                 root.right = insert(root.right, value);
             }
             return root;
         }

          static void inorder(Node root) {
             inorder(root.left);
             System.out.println(root.data + "");
             inorder(root.right);

         }
     }

         public static void main(String[] args) {
             int values [] ={5,1,3,4,6,8,7};
             Node root = null;
             for(int i = 0; i<values.length;i++){
                 root = Node.insert(root,values[1]);
             }
             Node.inorder(root);
             System.out.println();

         }


}
