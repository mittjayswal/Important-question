package com.as.mitt.test;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelTravsal {

	Node root;
	
	public static void main(String[] args) {
		BinaryTreeLevelTravsal bt = new BinaryTreeLevelTravsal();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		
		bt.travserLevel();
	}

	private void travserLevel() {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.data);
			
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
			
		}
		
	}
}

class Node {
	Node left;
	Node right;
	int data;

	Node (int data ){
		left = null;
		right = null;
		this.data = data;
	}
}
 
