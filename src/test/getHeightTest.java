package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.BinaryTree;

class getHeightTest {

	private BinaryTree<String> tree0 = new BinaryTree<>();
	private BinaryTree<String> tree01 = new BinaryTree<>();

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
		
	}
	
	@AfterEach
	public void destroy() {
		tree0.clear();
		tree01.clear();
	}
	
	@Test
	public void simpleHeight() {
		assertEquals(2, tree01.getHeight());
	}
	
	@Test
	public void simpleHeightBinaryMethod() {
		assertEquals(2, tree01.getHeight_callBinaryNodeMethod());
	}
	
	@Test
	public void simple5NodeHeight() {
		assertEquals(4, tree0.getHeight());
	}
	
	@Test
	public void simple5NodeHeightBinaryMethod() {
		assertEquals(4, tree0.getHeight_callBinaryNodeMethod());
	}
	
	
	

}
