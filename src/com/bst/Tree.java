package com.bst;

public class Tree {
    public Node root;
    public Node node;

    public Tree() {
        this.root = null;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getRoot(){
        return this.root;
    }

    public void insert(int chave)
    {
        node = new Node(chave); // Node atual a ser inserido

        if(this.root == null){
            System.out.println("Root nula");
            this.root = new Node(chave); // Se root não existir, usar node atual
        } else {
            Node parent_node = null; // Node anterior nulo
            Node curr_node = this.root; // Arvore começa pelo root

            while(true){
                if(curr_node != null){ // Se achar um node vazio...
                    System.out.println(curr_node.getChave());
                    // Coloca o node anterior como o node "atual" (logo o node atual vai mudar)
                    parent_node = curr_node; // Parent node usado no else
                    if(node.getChave() < curr_node.getChave()) { curr_node = curr_node.getLeft(); }
                    else if(node.getChave() > curr_node.getChave()) { curr_node = curr_node.getRight(); }
                    else { System.out.println("Valor já existe: " + node.getChave()); }
                } else {
                    if(node.getChave() < parent_node.getChave()) { parent_node.setLeft(node); }
                    else if(node.getChave() > parent_node.getChave()) { parent_node.setRight(node); }
                    else { System.out.println("Valor já existe: " + node.getChave()); }
                    break;
                }
            }
        }
    }

    public void show(Node curr_node){
        if(curr_node != null){
            System.out.println("Chave: " + curr_node.getChave() + " ");
            this.show(curr_node.getLeft());
            this.show(curr_node.getRight());
        }
    }

}

