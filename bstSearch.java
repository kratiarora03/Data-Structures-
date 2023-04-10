public class bstSearch {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static bstBuild.Node insert(bstBuild.Node root, int value) {
            if (root == null) {
                root = new bstBuild.Node(value);
            }
            if (root.data > value) {
                root.left = insert(root.left, value);
            }
            if (root.data < value) {
                root.right = insert(root.right, value);
            }
            return root;
        }

        static boolean search(Node root, int key) {
            if (root == null) {
                return false;
            }
            if (root.data < key) {
                return search(root.left, key);
            }
            if (root.data > key) {
                return search(root.right, key);

            } else if (root.data == key) {
                return true;

            }
            return false;
        }

        static void inorder(bstBuild.Node root) {
            inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);

        }


        public static void main(String[] args) {
            int values[] = {5, 1, 3, 4, 6, 8, 7};
            bstBuild.Node root = null;
            for (int i = 0; i < values.length; i++) {
                root = bstBuild.Node.insert(root, values[1]);
            }
            bstBuild.Node.inorder(root);
            System.out.println();

            if (search(root, 7)) {
                System.out.println("found");
            } else {
                System.out.println("not found");

            }
        }
    }
}

