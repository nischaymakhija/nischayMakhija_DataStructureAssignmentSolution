package com.greatlearning.main;
import com.greatlearning.models.Node;
import com.greatlearning.services.BSTService;

public class BSTtoSkewedMain {

	public static void main(String[] args)
	{
		
		BSTService obj = new BSTService();
		
		// hardcoded the complete BST
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(55);
		
		
		
		Node rightRoot = new Node(0);
		rightRoot = obj.BSTSkew(root);
		
		
		obj.traverseRightSkewed(rightRoot);
		
	}


}
