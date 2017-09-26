import java.util.*;

class Processor{
	
	int val;
	Processor right, left;
	List<Integer> list;
	Processor (int val){
		left =  null; right = null;
		this.val = val;
		this.list = new ArrayList<Integer>(){{add(val);}};
	}
}


public class Assignment4b {

	public static void main(String[] args) {
		
	Assignment4b m = new Assignment4b();
	Processor r = m.init();
	m.convergeCastWithList(r);
	System.out.println("Information at root node = "+ r.list);
		
	}
	
	/**
	**Method to initialize the tree of processors	
	**/
	private Processor init(){
		Processor root = new Processor(2);
		Processor n1 =  new Processor(7);
		Processor n2 =  new Processor(5);
		root.left = n1; root.right = n2;
		Processor n3 =  new Processor(2);
		Processor n4 =  new Processor(6);
		n1.left = n3; n1.right = n4;
		Processor n5 =  new Processor(9);
		Processor n6 =  new Processor(5);
		n2.right = n5; 
		Processor n7 =  new Processor(11);
		n4.left = n6; n4.right = n7;
		Processor n8 =  new Processor(4);
		n5.left = n8;
		return root;
	}
	
	/**
	**Recursive convergecast method to caluculate list of values of tree at root Processor
	**/
	private void convergeCastWithList(Processor p){
		if (p != null ){
			convergeCastWithList(p.left);
			convergeCastWithList(p.right);
			if (p.left != null)
				p.list.addAll(p.left.list);
			if (p.right != null)
				p.list.addAll(p.right.list);
		}
	}

}
