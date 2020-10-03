package dataStructures;




	class Node{
	    private int data;
	    private Node left;
	    private Node right;

	    public Node(int element){
	        data = element;
	        left = null;
	        right = null;
	    }
	    public Node()
	    {
	    
	    }

	    public void setRightChild(Node n)
	    {
	        right = n;
	    }

	    public void setLeftChild(Node n){
	        left = n;
	    }

	    public Node getRightChild(){
	        return right;
	    }

	    public Node getLeftChild(){
	        return left;
	    }

	    public int getData(){
	        return data;
	    }

	    public void setData(int x){
	        data = x;
	    }
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
