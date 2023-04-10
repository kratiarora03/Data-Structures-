public class trees1 {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
          static class binary_tree{
            static int index = -1;
              public static node build_tree(int[] node){
                index++;

                if(node[index] == -1){
                    return null;
                }
                node newNode = new node(node[index]);
                newNode.right = build_tree(node);
                newNode.left = build_tree(node);

                return newNode;

            }

             public static void main(String[] args) {
                 int node[] = {1,2,3,-1,-1,5,-1,-1};
                 binary_tree tree = new binary_tree();
                 node root = tree.build_tree(node);
                 System.out.println(root.data);


             }


        }
    }
}

