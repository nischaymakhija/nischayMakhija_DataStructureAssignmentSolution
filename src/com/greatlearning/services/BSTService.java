package com.greatlearning.services;

import com.greatlearning.models.Node;

public class BSTService {
	public Node rightRoot = null;

	
	public Node BSTSkew(Node root)
	{

		if(root == null) {
			return rightRoot;
		}
		else {
			BSTSkew(root.left);
			// calling method to add nodes to right skewed tree
			rightRoot = createSkew(rightRoot, root);
			BSTSkew(root.right);

		}	
		return rightRoot;
	}

	// this method creates and add nodes to right skewed tree
	public Node createSkew(Node rightRoot, Node root) {
		Node n = new Node(root.value);
		if(rightRoot == null) {
			return n;
		}else {
			rightRoot.right = createSkew(rightRoot.right, root);
		}
		return rightRoot;

	}

	// method traverses the right skewed tree
	public void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewed(root.right);       
	}


}
