package com.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Tree {
    private Node root = null;
    public Tree(){
        this.setRoot(null);
    }

    public void addElement(int element){
        if(this.getRoot() == null){
            this.setRoot(new Node(element));
        } else {
            addElement(element, this.getRoot());
        }
    }

    private void addElement(int element, Node reference){
       if(reference.getElement() < element){
           if(reference.getRight() != null){
               addElement(element, reference.getRight());
           }else{
               Node node = new Node(element);
               node.setParent(reference);
               reference.setRightChild(node);
               reference.setRight(node);
           }
       }else if(reference.getElement() > element){
           if(reference.getLeft() != null){
               addElement(element, reference.getLeft());
           }else{
               Node node = new Node(element);
               node.setParent(reference);
               reference.setLeftChild(node);
               reference.setLeft(node);
           }
       }
    }

    public List<Integer> preOrderTraversal(Node node, List<Integer> visited){
        if(node != null){
            visited.add(node.getElement());
            preOrderTraversal(node.getLeft(), visited);
            preOrderTraversal(node.getRight(), visited);
        }
        return visited;
    }

    public List<Integer> postOrderTraversal(Node node, List<Integer> visited){
        if(node != null){
            postOrderTraversal(node.getLeft(), visited);
            postOrderTraversal(node.getRight(), visited);
            visited.add(node.getElement());
        }
        return visited;
    }

    public List<Integer> inOrderTraversal(Node node, List<Integer> visited){
        if(node != null){
            inOrderTraversal(node.getLeft(), visited);
            visited.add(node.getElement());
            inOrderTraversal(node.getRight(), visited);
        }
        return visited;
    }

    public void bfs(Node node, Queue<Node> visited){
        if(node != null){
            if(!visited.contains(node)){
                visited.add(node);
            }
            if(visited.size() == 0){
                visited.add(node);
                bfs(node.getLeftChild(), visited);
                bfs(node.getRightChild(), visited);
            }else{
                Node n = visited.poll();
                System.out.println(n.getElement());
                bfs(node.getLeftChild(), visited);
                bfs(node.getRightChild(), visited);
            }
        }
        return;
    }

    public boolean search(Node n, int num){
        if(n == null)
            return false;
        if(n.getElement() == num)
            return true;
        if(n.getElement() > num){
            return search(n.getLeft(), num);
        }else if(n.getElement() < num){
            return search(n.getRight(), num);
        }
        return false;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
