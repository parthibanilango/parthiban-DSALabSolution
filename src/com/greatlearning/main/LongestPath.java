package com.greatlearning.main;

import java.util.ArrayList;

public class LongestPath {
	
	static class Node{
		int data;
		Node right ,left;
		
		public Node(int data) {
			this.data=data;
			right =left=null;
		}
	}

	public static void main(String[] args) {
		
		/*
		Node root = new Node( 10 );
		root.left = new Node( 20 );
		root.right = new Node( 30 );
		root.left.left = new Node( 40 );
		root.left.right = new Node( 50 );
		root.right.left = new Node( 60 );
		root.right.right = new Node( 70 );
		root.left.left.left = new Node( 80 );
		root.left.left.right = new Node( 90 );
		root.left.right.left = new Node( 100 );
		root.left.right.right = new Node( 110 );
		root.left.left.left.left = new Node( 120 );*/
		Node root = new Node( 100 );
		root.left = new Node( 20 );
		root.right = new Node( 130 );
		root.left.left = new Node( 10 );
		root.left.right = new Node( 50 );
		root.right.left = new Node( 110 );
		root.right.right = new Node( 140 );
		root.left.left.left = new Node(5);
		
		
		ArrayList<Node> longestPath = getLongestPath( root );
		
		for(int i=longestPath.size()-1;i>=0;i--) {
			String appendS = i==0 ?"":"->";
			System.out.print(longestPath.get(i).data+appendS);
		}
		System.out.println();
		System.out.println( longestPath.size() );
		
		
	}

	private static ArrayList<Node> getLongestPath(Node root) {
		
		if(root == null) {
			return new ArrayList<>();
		}
		ArrayList<Node> l = getLongestPath(root.left);
		ArrayList<Node> r = getLongestPath(root.right);
		
		if(l.size() > r.size()) {
			l.add(root);
			return l;
		}else {
			r.add(root);
			return r;
		}
	}
	
	

}
