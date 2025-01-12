package src.main;

public class Main {
    public static void main(String[] args){
        var tree = new BinarySearchTree();
        tree.inorder();
        tree.preorder();
        tree.postorder();
    }
}
