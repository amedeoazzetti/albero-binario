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

    public int calcolaLivello(Node n) {
        if (n == null) {
            return -1; // Livello di un nodo nullo è considerato -1
        }
        int leftLevel = calcolaLivello(n.getLeft());
        int rightLevel = calcolaLivello(n.getRight());
        return Math.max(leftLevel, rightLevel) + 1; // Livello del nodo corrente è il massimo tra i livelli dei figli + 1
    }

    public String mostraPercorso(Node start, Node end) {
        if (start == null) {
            return null; // Se il nodo di partenza è nullo, non c'è percorso
        }
        if (start == end) {
            return String.valueOf(start.getData()); // Se abbiamo raggiunto il nodo di destinazione, restituiamo il suo dato
        }
        // Cerca nei figli sinistro e destro
        String leftPath = mostraPercorso(start.getLeft(), end);
        String rightPath = mostraPercorso(start.getRight(), end);
        
        if (leftPath != null) {
            return start.getData() + " -> " + leftPath; // Se il percorso è stato trovato nel figlio sinistro, aggiungiamo il nodo corrente al percorso
        } else if (rightPath != null) {
            return start.getData() + " -> " + rightPath; // Se il percorso è stato trovato nel figlio destro, aggiungiamo il nodo corrente al percorso
        } else {
            return null; // Se il percorso non è stato trovato in nessuno dei figli, restituiamo null
        }
    }
}