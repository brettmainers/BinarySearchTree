public class BinarySearchTree {

    Node root = null;

    public void addNode(int val) {
        if (root == null) {
            root = new Node(val);
        } else {
            addNodeHelper(root, val);
        }
    }

    private Node addNodeHelper(Node node, int val) {
        if (node == null) {
            return new Node(val);
        } else if (val < node.val) {
            node.leftChild = addNodeHelper(node.leftChild, val);
        } else {
            node.rightChild = addNodeHelper(node.rightChild, val);
        }
        return node;
    }

    public boolean search(int val) {
        return searchHelper(root, val);
    }

    private boolean searchHelper(Node node, int val) {
        if (node == null) {
            return false;
        } else if (val == node.val) {
            return true;
        } else if (val < node.val) {
            return searchHelper(node.leftChild, val);
        } else {
            return searchHelper(node.rightChild, val);
        }
    }

    public void removeNode(int val) {
        root = removeNodeHelper(root, val);
    }

    private Node removeNodeHelper(Node node, int val) {
        if (node == null) {
            return null;
        }

        if (val < node.val) {
            node.leftChild = removeNodeHelper(node.leftChild, val);
        } else if (val > node.val) {
            node.rightChild = removeNodeHelper(node.rightChild, val);
        } else {
            if (node.leftChild == null) {
                return node.rightChild;
            } else if (node.rightChild == null) {
                return node.leftChild;
            }

            node.val = findMinValue(node.rightChild);


            node.rightChild = removeNodeHelper(node.rightChild, node.val);
        }

        return node;
    }
    
    private int findMinValue(Node node) {
        int minValue = node.val;
        while (node.leftChild != null) {
            minValue = node.leftChild.val;
            node = node.leftChild;
        }
        return minValue;
    }

    public void inorderTraversal() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.leftChild);
            System.out.print(node.val + " ");
            inorderHelper(node.rightChild);
        }
    }

    public void preorderTraversal() {
        preorderHelper(root);
        System.out.println();
    }

    private void preorderHelper(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorderHelper(node.leftChild);
            preorderHelper(node.rightChild);
        }
    }

    public void postorderTraversal() {
        postorderHelper(root);
        System.out.println();
    }

    private void postorderHelper(Node node) {
        if (node != null) {
            postorderHelper(node.leftChild);
            postorderHelper(node.rightChild);
            System.out.print(node.val + " ");
        }
    }
    }
