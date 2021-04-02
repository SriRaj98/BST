public class BST{
    
    
    class Node{
        int val;
        Node left;
        Node right;
        
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
        System.out.println(root.val);
        inorder(root.right);
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
        app.inor();
    }
}


