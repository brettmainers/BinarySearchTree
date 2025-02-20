public class BinarySearchTree {

    Node root = null;

    public void addNode(int val) {
        if (root == null) {
            root = new Node(val);
        } else if (val < root.val){
            addNodeHelper(root.leftChild,val);
        } else {
            addNodeHelper(root.rightChild,val);
        }
    }

    private static Node addNodeHelper(Node node, int val) {
        if (node == null) {
            new Node(val);
        } else if (val < node.val) {
            node.leftChild = addNodeHelper(node.leftChild, val);
        } else {
            node.rightChild = addNodeHelper(node.rightChild, val);
        }
        return node;
    }
}

