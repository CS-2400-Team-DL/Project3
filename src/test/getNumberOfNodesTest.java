package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.BinaryTree;

class getNumberOfNodesTest {

	private BinaryTree<String> tree0 = new BinaryTree<>();
	private BinaryTree<String> tree01 = new BinaryTree<>();
   private BinaryTree<String> treeNull = new BinaryTree<>();

	@BeforeEach
	public void init() {
		BinaryTree<String> tree5 = new BinaryTree<>("F");
		BinaryTree<String> tree3 = new BinaryTree<>("D");
		BinaryTree<String> tree4 = new BinaryTree<>("E", null, tree5);
		BinaryTree<String> tree1 = new BinaryTree<>("B", null, tree3);
		BinaryTree<String> tree2 = new BinaryTree<>("C", tree4, null);
		
		tree0 = new BinaryTree<>("A", tree1, tree2);
		
		
		BinaryTree<String> tree11 = new BinaryTree<>("B");
		BinaryTree<String> tree21 = new BinaryTree<>("C");
		
		tree01 = new BinaryTree<>("A", tree11, tree21);
		
      treeNull = new BinaryTree<>(null);
	}
	
	@AfterEach
	public void destroy() {
		tree0.clear();
		tree01.clear();
	}
	
	@Test
	public void simpleNumOfNodesTest() {
		assertEquals(3, tree01.getNumberOfNodes());
	}
	
	@Test
	public void simple4HeightNumOfNodesTest() {
		assertEquals(6, tree0.getNumberOfNodes());
	}

   @Test
   public void simpleNullNumOfNodesTest() {
      assertEquals(1, treeNull.getNumberOfNodes());
   }
}
