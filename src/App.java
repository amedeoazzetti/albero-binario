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
        Node i = new Node('I');

        BinaryTree tree = new BinaryTree(a);
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        e.setLeft(g);
        e.setRight(h);
        c.setRight(f);
        f.setLeft(i); 

        System.out.println("Preorder");
        tree.preorder();
        System.out.println(""); 
        System.out.println("Inorder");
        tree.inorder();
        System.out.println(""); 
        System.out.println("Postorder");
        tree.postorder();
        System.out.println(""); 
    }
}