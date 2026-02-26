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
            return;
        }
        postorder(n.getLeft());
        postorder(n.getRight());
        System.out.print(n.getData());
    }
    
    public int nodeCounter(Node root) {
        if (root == null) {
            return 0;
        }
        return nodeCounter(root.getLeft()) + nodeCounter(root.getRight()) + 1;
    }

    /**
     * Conta quanti nodi foglia sono contenuti nel sotto-albero
     * @param root nodo iniziale del sotto albero
     * @return numero di quanti nodi foglia
     */
    public int leavesCounter(Node root){
        // exit clause
        if(root == null)
            return 0;
        
        // se il nodo è una foglia (non ha figli a sinistra né a destra)
        if(root.getLeft() == null && root.getRight() == null)
            return 1;
        
        // conta ricorsivamente le foglie nei sottoalberi sinistro e destro
        return leavesCounter(root.getLeft()) + leavesCounter(root.getRight());
    }

    /**
     * Cerca se una lettera specifica e' presente nell'albero
     * @param root nodo iniziale del sotto albero
     * @param letter lettera da cercaer
     * @return esito della ricerca 
     */
    public boolean searchNode(Node root, char letter){
        // exit clause 
        if (root == null) return false;
        if (root.getData()==letter) return true;

        // chiamata ricorsiva
        return searchNode(root.getLeft(), letter) || searchNode(root.getRight(), letter);
        
    }

    public int dept(){
        return dept(root);
    }

    public int dept(Node next){
        if(next == null) return 0;

        int leftDepth = dept(next.getLeft());
        int rightDepth = dept(next.getRight());

         if(leftDepth > rightDepth) 
             return leftDepth + 1;
        else
            return rightDepth + 1;
    }
}