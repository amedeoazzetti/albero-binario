public class BinaryTree {
    
    private Node root;

    public BinaryTree() {

        this.root = null;
    }

    public BinaryTree(Node n) {

        this.root = n;
    }

    // depth-first
    public void preorder() {
        preorder(root);
    }

    /**
     * I nodi genitori sono visitati prima dei nodi figli
     * @param n nodo di partenza
     */
    private void preorder(Node n) {

        // exit clause
        if (n == null) return;

        System.out.print(n.getData()); 
        preorder(n.getLeft());
        preorder(n.getRight()); 
    }

    public void inorder() {
        inorder(root);
    }

    // in-order
    private void inorder(Node n) {

        // exit clause
        if (n == null) return;

        inorder(n.getLeft());
        System.out.print(n.getData()); 
        inorder(n.getRight()); 
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(Node n) {
        if (n == null) {
            System.out.println("Nodo nullo trovato in postorder");
            return;
        }
        postorder(n.getLeft());
        postorder(n.getRight());
        System.out.print(n.getData());
    }
    
    public int nodeCounter(Node root) {
        if (root == null) {
            System.out.println("Nodo nullo trovato in nodeCounter");
            return 0;
        }
        return nodeCounter(root.getLeft()) + nodeCounter(root.getRight()) + 1;
    }
}