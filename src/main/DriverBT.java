package main;

public class DriverBT 
{
	public static void main(String[] args)
	{
		System.out.println("1st Testing Example:");
		BinaryTree<String> aTree = new BinaryTree<>();
		createTree1(aTree);
		
		System.out.println("(binaryTree) post-order: ");
		aTree.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree.getNumberOfNodes_callBinaryNodeMethod());

		System.out.println("==========================================");
		System.out.println();
		
		System.out.println("2nd Testing Example:");
		BinaryTree<String> aTree2 = new BinaryTree<>();
		createTree2(aTree2);
		
		System.out.println("(binaryTree) post-order: ");
		aTree2.postorderTraverse();
		
		System.out.println("(binaryNode) post-order: ");
		aTree2.postorderTraverse_callBinaryNodeMethod();
		
		System.out.println();
		
		System.out.println("(BinaryTree) Height of tree is " + aTree2.getHeight());
		System.out.println("(BinaryNode) Height of tree is " + aTree2.getHeight_callBinaryNodeMethod());
		
		System.out.println();
		
		System.out.println("(BinaryTree) # nodes of tree is " + aTree2.getNumberOfNodes());
		System.out.println("(BinaryNode) # nodes of tree is " + aTree2.getNumberOfNodes_callBinaryNodeMethod());
		
		System.out.println("Done.");
	}  // end main

	public static void createTree1(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> dTree = new BinaryTree<>("D");
		BinaryTree<String> eTree = new BinaryTree<>("E");
		BinaryTree<String> gTree = new BinaryTree<>("G");

		// Subtrees:
		BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
		BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
		BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

		tree.setTree("A", bTree, cTree);
		
      System.out.println("\nGiven Tree:\n");
      System.out.println("     A      ");
      System.out.println("   /   \\  ");
      System.out.println("  B     C  ");
      System.out.println(" / \\   /  ");
      System.out.println("D   E  F   ");
      System.out.println("        \\ ");
      System.out.println("         G ");
      System.out.println();
	} // end createTree
	
	/**-------------------------------------------------------------------- */
	/**Task 4: Create a tree case as shown in assignment 3*/
	public static void createTree2(BinaryTree<String> tree)
	{ 
		// Leaves
		BinaryTree<String> tree5 = new BinaryTree<>("E");
		BinaryTree<String> tree8 = new BinaryTree<>("H");
		BinaryTree<String> tree9 = new BinaryTree<>("I");
		BinaryTree<String> tree10 = new BinaryTree<>("J");
		BinaryTree<String> tree11 = new BinaryTree<>("K");

		// Subtrees:
		BinaryTree<String> tree4 = new BinaryTree<>("D", tree8, tree9);
		BinaryTree<String> tree6 = new BinaryTree<>("F", tree10, null);
		BinaryTree<String> tree7 = new BinaryTree<>("G", null, tree11);
		
		// Subtree lvl 2
		BinaryTree<String> tree2 = new BinaryTree<>("B", tree4, tree5);
		BinaryTree<String> tree3 = new BinaryTree<>("C", tree6, tree7);

		// Root Node
		tree.setTree("A", tree2, tree3);
		
		System.out.print(
		"\nGiven Tree:\n" +
		"            A                 \n"+
		"          /   \\                \n"+
		"        B       C              \n"+
		"      /  \\     / \\           \n"+
		"    D     E   F    G         \n"+
		"  /   \\     /       \\      \n"+
		" H     I   J         K    \n");

	} // end createTree2

}  // end DriverBT
