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
     *
     * @param n nodo di partenza
     */
    private void preorder(Node n) {

        // exit clause
        if (n == null) {
            return;
        }

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
        if (n == null) {
            return;
        }

        inorder(n.getLeft());
        System.out.print(n.getData());
        inorder(n.getRight());
    }

    public void postorder() {
        postorder(root);
    }

    // post-order
    private void postorder(Node n) {

        // exit clause
        if (n == null) {
            return;
        }

        postorder(n.getLeft());
        postorder(n.getRight());
        System.out.print(n.getData());
    }

    /**
     * Conta quanti nodi sono presenti nel sotto-albero in input
     *
     * @param root nodo iniziale del sotto-albero
     * @return numero di nodi contenuti
     */
    public int nodeCounter(Node root) {

        // exit clause + caso base
        if (root == null) {
            return 0;
        }

        // chiamata ricorsiva
        return nodeCounter(root.getLeft()) + nodeCounter(root.getRight()) + 1;
    }

    /**
     * Conta quanti nodi foglia sono contenuti nel sotto-albero
     *
     * @param root nodo iniziale del sotto-albero
     * @return numero di nodi foglia presenti
     */
    public int leavesCounter(Node root) {

        // exit clause
        if (root == null) {
            return 0;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }

        // chiamata ricorsiva
        return leavesCounter(root.getLeft()) + leavesCounter(root.getRight());
    }

    /**
     * Cerca se una lettera specifica è presente nell'albero
     *
     * @param root nodo iniziale del sotto-albero
     * @param letter lettera da cercare
     * @return esito della ricerca
     */
    public boolean searchNode(Node root, char letter) {

        // exit clause
        if (root == null) {
            return false;
        }
        if (root.getData() == letter) {
            return true;
        }

        // chiamata ricorsiva
        return searchNode(root.getLeft(), letter) || searchNode(root.getRight(), letter);
    }

    /**
     * Calcola la profondità dell'albero (il percorso più lungo)
     *
     * @param root nodo di partenza dell'albero
     * @return la lunghezza del percorso più lungo
     */
    public int depth(Node root) {

        // exit clause
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 0;    // foglia
        }
        // chiamata ricorsiva
        int leftDepth = depth(root.getLeft());
        int rightDepth = depth(root.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int  contaProfonditaNodo(Node cercato) {
        int profondità = 1;
        Node n = root;

        if (n.equals(cercato)) 
            return profondità;

        return profondità;
        

    }
}