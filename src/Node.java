public class Node {
    
    private char data;
    private Node left, right;

    public Node(char d) {
        this.data = d;
        this.left = this.right = null;
    }

    public char getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}