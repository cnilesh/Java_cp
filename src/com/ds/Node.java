package com.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node {

    private int element;
    private Node left;
    private Node right;
    private Node parent = null;
    private Node leftChild;
    private Node rightChild;

    public Node(int element){
        this.setLeft(null);
        this.setRight(null);
        this.setElement(element);
    }

    public Node(int element, Node left, Node right){
        this.setElement(element);
        this.setLeft(left);
        this.setRight(right);
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
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

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return element == node.element;
    }

    @Override
    public int hashCode() {

        return Objects.hash(element);
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
