public class BinaryTree {
    Node root;

    static class Node {
        int key;
        Node left;
        Node right;

        //Constructor for the node that has a key value
        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
        //inserting values into Node
        private Node insertNode(Node node, int key) {
            //check if the tree is empty then it is a leaf node and you create a new Node there
            if(node == null) {
                return new Node(key);
            }

            if(key < node.key) {
                //insert it to the left node
                node.left = insertNode(node.left, key);
            } else if( key > node.key) {
                node.right = insertNode(node.right, key);
            } else {
                //if value exists
                return node;
            }
            return node;
        }

        public void add(int key) {
            root = insertNode(root, key);
        }

    private BinaryTree createBinaryTree() {
        BinaryTree tree = new BinaryTree();

        tree.add(3);
        tree.add(6);
        tree.add(7);
        tree.add(1);
        tree.add(4);
        return tree;
    }

    }

