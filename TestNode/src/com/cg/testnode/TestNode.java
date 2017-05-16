package com.cg.testnode;

import java.util.ArrayList;
import java.util.List;

public class TestNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(testNode());
	}
	
	public static int testNode() {
		int retVal = -1;
		Node root = new Node(5);
		
		Node node3 = new Node(3);
		Node node10 = new Node(10);
		root.setLeft(node3);
		root.setRight(node10);
		
		Node node20 = new Node(20);
		Node node21 = new Node(21);
		node3.setLeft(node20);
		node3.setRight(node21);
		
		Node node1 = new Node(1);
		node10.setLeft(node1);
		
		
		if(root != null && (root.left() != null || root.right() != null)) {
			List<Integer> list = new ArrayList<>();
			retVal =   checkNode(root, list);
		}
		
		return retVal;
	}
	
	public static int checkNode(Node root, List<Integer> list) {
		int retVal = 0;
		
		System.out.print("Node value  :: " + root.getValue() + " Checking with Values : " );
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("");
				
		List<Integer> newList = new ArrayList<>(list);
		retVal = retVal + checkAllValuesInList(list, root.getValue());
		newList.add(root.getValue());
		
		if(root.left() != null) {
			System.out.println("Left Check for Node with value ::::>>> " +  root.left().getValue() );
			retVal = retVal + checkNode(root.left(), newList);
		}
		
		if(root.right() != null) {
			System.out.println("Right Check for Node with value ::::>>> " +  root.right().getValue() );
			retVal = retVal + checkNode(root.right(), newList);
		}
		
		return retVal;
	}

	private static int checkAllValuesInList(List<Integer> list, int val) {
		boolean greaterValueFound = false;
		
		for(int i : list) {
			if( i > val) {
				greaterValueFound = true;
				break;
			}
		}
		
		if(greaterValueFound) {
			return 0;
		} else {
			return 1;
		}
		
	}

}
