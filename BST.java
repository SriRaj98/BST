import java.util.*;
public class BST{
    class Node{
        int val;
        Node left;
        Node right;

        //constructor for Node
        Node(int input){
        val = input;
        }}
        

    Node root;
    
    BST(){
        root = null;
    }
    

        
    void in(int val){
        root = insert(root, val);
    }

    void inor(){
        inorder(root);
        System.out.println("");

    }
    void preor(){
        preorder(root);
        System.out.println("");

    }
    void postor(){
        postorder(root);
        System.out.println("");

    }
    
    Node insert(Node root, int val){
            
            
            if(root == null){
                root =new Node(val);
                return root;
            }
            else if(root.val > val){
                root.left = insert(root.left , val);
            }
            else {
                root.right = insert(root.right, val);
            }
            return root;
            
        }     
        
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+ ", ");
        inorder(root.right);
    }
    
    void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+", ");
        preorder(root.left);
        preorder(root.right);
    }
    
    void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+", ");

    }
    
    void bfs(){
        Queue<Node> trav  = new LinkedList<>();
        trav.add(root);
        while(trav.peek()!=null){
            Node a =trav.poll();
            System.out.print(a.val+", ");
            if(a.left != null){
                trav.add(a.left);
                
            }
            if(a.right != null){
                trav.add(a.right);
            }
            
        }
        System.out.println("");
        return;
    }
    void dfs(){
        Stack<Node> trav  = new Stack<>();
        trav.push(root);
        while(!trav.empty()){
            Node a =trav.pop();
            System.out.print(a.val+", ");
            if(a.right != null){
                trav.push(a.right);
            }
            if(a.left != null){
                trav.push(a.left);
                
            }

            
        }
        System.out.println("");
        return;
    }

    void dfsin(){
        Stack<Node> trav  = new Stack<>();
        trav.push(root);
        Node current = root;
        while(!trav.empty()){
            while(current.left != null){
                trav.push(current.left);
                current = current.left;
            }
            current = trav.pop();
            System.out.print(current.val+", ");
            if(current.right != null){
                current = current.right;
                trav.push(current);
            }
        }
        System.out.println("");
        return;
    }
    
    

            public static void main(String[] args){
        BST app  = new BST();
        app.in(9);
        app.in(3);
        app.in(1);
        app.in(6);
        app.in(2);
        app.in(7);
        app.in(4);
        System.out.println("Inorder");
        app.inor();
        System.out.println("BFS");
        app.bfs();
        System.out.println("DFS");
        app.dfs();
        System.out.println("POst");
        app.postor();
        System.out.println("Pre");
        app.preor();
        System.out.println("DFS Inorder: ");
        app.dfsin();
        
    }
}


