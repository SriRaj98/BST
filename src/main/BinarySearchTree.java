package src.main;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    public Node root;

    // Generates a basic BST
    BinarySearchTree(){
        var tree = new BinarySearchTree(1);
        for(int i = 2; i <=16 ; i++) {
            tree.insert(i);
        }
        root = tree.root;
    }

    BinarySearchTree(Node node){
        root = node;
    }

    BinarySearchTree(int value){
        root = new Node(value);
    }

    public void insert(int value){
        insert(root, value);
    }

    private Node insert(Node root, int value) {
        if(root == null){
            root =new Node(value);
            return root;
        }
        else if(root.getValue() > value){
            root.left = insert(root.left , value);
        }
        else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inorder(){
        var list = new ArrayList<Integer>();
        inorder(list, this.root);
        System.out.println(list);
    }

    private void inorder(List<Integer> list, Node root){
        if(root == null){
            return;
        }
        inorder(list, root.left);
        list.add(root.getValue());
        inorder(list, root.right);
    }

    public void preorder(){
        var list = new ArrayList<Integer>();
        preorder(list, this.root);
        System.out.println(list);
    }

    private void preorder(List<Integer> list, Node root){
        if(root == null){
            return;
        }
        list.add(root.getValue());
        inorder(list, root.left);
        inorder(list, root.right);
    }

    public void postorder(){
        var list = new ArrayList<Integer>();
        postorder(list, this.root);
        System.out.println(list);
    }

    private void postorder(List<Integer> list, Node root){
        if(root == null){
            return;
        }
        inorder(list, root.left);
        inorder(list, root.right);
        list.add(root.getValue());
    }
}
