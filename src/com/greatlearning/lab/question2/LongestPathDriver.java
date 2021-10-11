package com.greatlearning.lab.question2;

import java.util.ArrayList;

public class LongestPathDriver {

	public static void main(String[] args) {

		Node root = new Node(100);
		
		Node node1 = new Node(20);
		Node node2 = new Node(130);
		Node node3 = new Node(10);
		Node node4 = new Node(50);
		Node node5 = new Node(110);
		Node node6 = new Node(140);
		Node node7 = new Node(5);

		root.left = node1;
		root.right = node2;
		
		node3.left = node7;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;
		
		LongestPath longestpath = new LongestPath();
		ArrayList<Integer> path = longestpath.longestPath(root);
		
		longestpath.display(path);
		

	}

}
