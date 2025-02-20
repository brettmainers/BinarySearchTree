public class Main {
    public static void main(String[] args) throws Exception {

        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(10);
        bst.addNode(5);
        bst.addNode(15);
        bst.addNode(3);
        bst.addNode(7);
        bst.addNode(12);
        bst.addNode(18);


        System.out.println("Inorder traversal:");
        bst.inorderTraversal();
        System.out.println();

        System.out.println("Preorder traversal:");
        bst.preorderTraversal();
        System.out.println();

        System.out.println("Postorder traversal:");
        bst.postorderTraversal();
        System.out.println();

        System.out.println("Searching for 7: " + bst.search(7));
        System.out.println("Searching for 20: " + bst.search(20));
        System.out.println();

        System.out.println("Removing 10");
        System.out.println();
        bst.removeNode(10);
        System.out.println("Inorder traversal after removing 10:");
        bst.inorderTraversal();

    }
}
