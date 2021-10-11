package com.greatlearning.lab.question2;

import java.util.ArrayList;

class Node{
	int key;
	Node left, right;
	
	Node(int data) {
		
		key = data;
		left = null;
		right = null;
	}
}


public class LongestPath {
	
     ArrayList<Integer> longestPath(Node root) {
    	
    	if(root == null) {
    		
    		ArrayList<Integer> path = new ArrayList<>();
    		return path;
    	}
    	
    	ArrayList<Integer> left = longestPath(root.left);
    	ArrayList<Integer> right = longestPath(root.right);
    	
    	if(left.size() > right.size()) {
    		left.add(root.key);
    	}
    	else {
    		right.add(root.key);
    	}
    	
    	return left.size()>right.size()?left:right;
    }
     
     void display(ArrayList<Integer> path) {
    	 
    	ArrayList<Integer> result = new ArrayList<>();
    		 
    	for(int i=path.size()-1; i>=0; i--) {
    	
    		result.add(path.get(i));
    	}
    	
    	if(path.size() == 0)
    		System.out.println("Path is null");
    	else
    	    System.out.println("Path is : "+result);
    	 
     }
	 
}
