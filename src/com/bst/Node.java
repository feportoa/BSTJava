package com.bst;

public class Node {

    private int chave;
    private Node left;
    private Node right;

    public Node(int chave){
        this.chave = chave;
        this.left = null;
        this.right = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
