package com.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeTest {

    public static void main(String args[]){
        Tree tree = new Tree();
        tree.addElement(5);
        tree.addElement(6);
        tree.addElement(4);
        tree.addElement(0);
        tree.addElement(1);
        tree.addElement(15);
        System.out.println(tree);
        tree.bfs(tree.getRoot(), new LinkedBlockingQueue<Node>());
        System.out.println(tree.search(tree.getRoot(),12));
    }
}
