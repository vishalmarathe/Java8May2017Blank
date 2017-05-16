package com.cg.testnode;

public class Node {

	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node left() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node right() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
}
