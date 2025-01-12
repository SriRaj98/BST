package src.main;

public class Node {
    Node right;
    Node left;
    private final int value;


    Node(int _value){
        value = _value;
    }
    public int getValue(){
        return value;
    }
}
