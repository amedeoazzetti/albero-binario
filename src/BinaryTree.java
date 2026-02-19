public class BinaryTree {
    
    private Node root;

    public BinaryTree() {

        this.root = null;
    }

    public BinaryTree(Node n) {

        this.root = n;
    }

    // depth-first


    // pre-order

    public void preoder(){
        preoder(root);
    }
    /**
     *  I nodi gneitori sono visitati prima dei nodi figli
     * @param n nodo di partenza
     */
    private void preoder(Node n){
        // exit claude
        if (n == null) return;

        System.out.print(n.getData());

        preoder(n.getLeft());
        preoder(n.getRight());
    }

    // in-order
    public void inorder(){
        inorder(root);
    }

    private void inorder(Node n){
        // exit claude
        if (n == null) return;

        
        preoder(n.getLeft());
        System.out.print(n.getData());
        preoder(n.getRight());
        
    }

    // post-order
    public void postorder(){
        postorder(root);
    }


    private void postorder(Node n){
        // exit claude
        if (n == null) return;

        
        preoder(n.getLeft());
        preoder(n.getRight());
        System.out.print(n.getData());
        
    }
}