package dataStructures;

public class traversalBinaryTree {
	
	Node root;
	
	
public traversalBinaryTree()
{
	root=null;
}

void printPreorder(Node node)
{
	if (node==null)
	return ;
	//printPreorder(node.getData());
	printPreorder(node.getLeftChild());
	
	
}

}
