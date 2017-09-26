class Node{
	
	int val;
	Node right, left;
	Node (int val){
		left =  null; right = null;
		this.val = val;
	}
}

public class Assignment4a {

	public static void main(String[] args) {
		
		Assignment4a m = new Assignment4a();
		System.out.println("Max value at root node = " + m.convergeCast(m.init()));

	}
	
	/**
	**Init method to initialize the Tree of Nodes (Processors)
	**/
	private Node init(){
		Node root = new Node(2);
		Node n1 =  new Node(7);
		Node n2 =  new Node(5);
		root.left = n1; root.right = n2;
		Node n3 =  new Node(2);
		Node n4 =  new Node(6);
		n1.left = n3; n1.right = n4;
		Node n5 =  new Node(9);
		Node n6 =  new Node(5);
		n2.right = n5; 
		Node n7 =  new Node(11);
		n4.left = n6; n4.right = n7;
		Node n8 =  new Node(4);
		n5.left = n8;
		return root;
	}
	
	/**
	**Recursive convergecast method to caluculate List of values for tree
	**/
	private int convergeCast(Node n){
		if (n == null)
			return Integer.MIN_VALUE;
		else 
			return Math.max(convergeCast(n.left),Math.max(convergeCast(n.right),n.val));
	}

}
