public class App {
    public static void main(String[] args) throws Exception {
        
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');

        BinaryTree tree = new BinaryTree(a);
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        c.setLeft(e);
        c.setRight(f);
        f.setLeft(g);
        f.setRight(h); 
    }
}