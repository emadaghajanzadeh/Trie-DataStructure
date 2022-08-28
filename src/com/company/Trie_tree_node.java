package com.company;

public class Trie_tree_node {
    private int data ;
    private Trie_tree_node rightChild ;
    private Trie_tree_node leftChild ;
    public boolean isNumber ;
    private int depth ;

    public Trie_tree_node(){
        this.isNumber = false ;
    }


    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getData() {
        return data;
    }


    public void setRightChild(Trie_tree_node rightChild) {
        this.rightChild = rightChild;
    }

    public void setLeftChild(Trie_tree_node leftChild) {
        this.leftChild = leftChild;
    }

    public Trie_tree_node getLeftChild() {
        return leftChild;
    }

    public Trie_tree_node getRightChild() {
        return rightChild;
    }


    public void setData(int data) {
        this.data = data;
    }

}
